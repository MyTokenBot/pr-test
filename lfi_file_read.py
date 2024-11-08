from flask import Flask, request

app = Flask(__name__)

@app.route('/read_file')
def read_file():
    # Vulnerable code
    filename = request.args.get('filename')
    with open(filename, 'r') as f:
        content = f.read()
    return content

if __name__ == '__main__':
    app.run(debug=True)
