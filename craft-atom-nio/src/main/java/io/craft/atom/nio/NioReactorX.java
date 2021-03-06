package io.craft.atom.nio;

import io.craft.atom.io.IoReactorX;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * @author mindwind
 * @version 1.0, Oct 15, 2014
 */
@ToString
public class NioReactorX implements IoReactorX {
	
	
	@Getter @Setter private int aliveChannelCount   ;
	@Getter @Setter private int newChannelCount     ;
	@Getter @Setter private int flushingChannelCount;
	@Getter @Setter private int closingChannelCount ;

	
	@Override
	public int aliveChannelCount() {
		return aliveChannelCount;
	}

	@Override
	public int newChannelCount() {
		return newChannelCount;
	}

	@Override
	public int flushingChannelCount() {
		return flushingChannelCount;
	}

	@Override
	public int closingChannelCount() {
		return closingChannelCount;
	}

}
