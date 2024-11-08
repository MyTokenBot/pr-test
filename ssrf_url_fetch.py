import requests
from flask import Flask, request

app = Flask(__name__)

@app.route('/fetch_url')
def fetch_url():
    # Vulnerable code
    url = request.args.get('url')
    response = requests.get(url)
    return response.text

if __name__ == '__main__':
    app.run(debug=True)
