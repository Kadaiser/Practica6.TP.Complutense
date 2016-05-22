package es.ucm.fdi.tp.Practica6.server.response;

import es.ucm.fdi.tp.basecode.bgame.model.Board;
import es.ucm.fdi.tp.basecode.bgame.model.Game.State;
import es.ucm.fdi.tp.basecode.bgame.model.GameObserver;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;

public class GameOverResponse implements Response {

	private static final long serialVersionUID = 1L;
	private Board board;
	private State state;
	private Piece winner;

	/**
	 * <b>GameOverResponse</b>
	 * <p>Contructor de la respuesta enviada en el canal de comunicacion</p>
	 * @param board of the game
	 * @param turn of the winner
	 * @param winner of the game
	 */
	public GameOverResponse(Board board, State state, Piece winner) {
		this.board = board;
		this.state = state;
		this.winner = winner;
	}

	@Override
	public void run(GameObserver o) {
		o.onGameOver(board, state, winner);

	}

}
