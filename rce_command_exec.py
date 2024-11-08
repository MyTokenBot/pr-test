import os
from flask import Flask, request

app = Flask(__name__)

@app.route('/exec_command')
def exec_command():
    # Vulnerable code
    cmd = request.args.get('cmd')
    os.system(cmd)
    return 'Command executed'

if __name__ == '__main__':
    app.run(debug=True)
