from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello_world():
    return "<p>Hello, World!</p>"


@app.route("/game_data")
def game_data():
    return {
        'playerId': 123,
        'hunger': 4,
        'clean': 8,
        'health': 9,
        'loneliness': 4,
        'state': 'hungry'
    }

