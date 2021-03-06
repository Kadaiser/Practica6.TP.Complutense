package es.ucm.fdi.tp.Practica6.server.response;

import es.ucm.fdi.tp.basecode.bgame.model.Board;
import es.ucm.fdi.tp.basecode.bgame.model.GameObserver;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;

public class MoveEndResponse implements Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Board board;
	private Piece turn;
	private boolean success;

	/**
	 * <b>MoveEndResponse</b>
	 * <p>Contructor de la respuesta enviada en el canal de comunicacion</p>
	 * @param board of the game
	 * @param turn owner
	 * @param success boolean controller
	 */
	public MoveEndResponse(Board board, Piece turn, boolean success) {
		this.board = board;
		this.turn = turn;
		this.success = success;
	}

	@Override
	public void run(GameObserver o) {
		o.onMoveEnd(board, turn, success);

	}

}
