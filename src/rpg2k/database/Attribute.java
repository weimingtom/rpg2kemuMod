package rpg2k.database;

import rpg2k.*;

public class Attribute extends Data
{
	public static final int INDEX = 0x11;
	
	protected Attribute(byte[][][] data) {
		super(data);
	}
	protected Object[] getDefaults() {
		return DEFAULT;
	}
	protected static final Object[] DEFAULT = {
		null,
		// 名前
		// 0x01
		"\0",
		// 識別
		// 0x02
		// 0:武器属性
		// 1:魔法属性
		new Integer(0), null, null, null, null, null, null, null, null,
		// 効果量変動量 / Ａ
		// 0x0B
		new Integer(300),
		// 効果量変動量 / Ｂ
		// 0x0C
		new Integer(200),
		// 効果量変動量 / Ｃ
		// 0x0D
		new Integer(100),
		// 効果量変動量 / Ｄ
		// 0x0E
		new Integer(50),
		// 効果量変動量 / Ｅ
		// 0x0F
		new Integer(0),
	};
	protected Type[] getTypes() {
		return TYPE;
	}
	protected static final Type[] TYPE = {
		
	};
}