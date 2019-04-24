// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.JsonUtils;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcu

public final class zzca
	implements GameManagerState
{

	public zzca(int i, int j, String s, JSONObject jsonobject, Collection collection, String s1, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzuk = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int zzuk>
		zzul = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field int zzul>
		zzum = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String zzum>
		zzun = jsonobject;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field JSONObject zzun>
		zztv = s1;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #33  <Field String zztv>
		zztw = k;
	//   17   31:aload_0         
	//   18   32:iload           7
	//   19   34:putfield        #35  <Field int zztw>
		zzuo = ((Map) (new HashMap(collection.size())));
	//   20   37:aload_0         
	//   21   38:new             #37  <Class HashMap>
	//   22   41:dup             
	//   23   42:aload           5
	//   24   44:invokeinterface #43  <Method int Collection.size()>
	//   25   49:invokespecial   #46  <Method void HashMap(int)>
	//   26   52:putfield        #48  <Field Map zzuo>
		for(s = ((String) (collection.iterator())); ((Iterator) (s)).hasNext(); zzuo.put(((Object) (((PlayerInfo) (jsonobject)).getPlayerId())), ((Object) (jsonobject))))
	//*  27   55:aload           5
	//*  28   57:invokeinterface #52  <Method Iterator Collection.iterator()>
	//*  29   62:astore_3        
	//*  30   63:aload_3         
	//*  31   64:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  32   69:ifeq            105
			jsonobject = ((JSONObject) ((PlayerInfo)((Iterator) (s)).next()));
	//   33   72:aload_3         
	//   34   73:invokeinterface #62  <Method Object Iterator.next()>
	//   35   78:checkcast       #64  <Class PlayerInfo>
	//   36   81:astore          4

	//   37   83:aload_0         
	//   38   84:getfield        #48  <Field Map zzuo>
	//   39   87:aload           4
	//   40   89:invokeinterface #68  <Method String PlayerInfo.getPlayerId()>
	//   41   94:aload           4
	//   42   96:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   43  101:pop             
	//*  44  102:goto            63
	//   45  105:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          242
		{
			if(!(obj instanceof GameManagerState))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #6   <Class GameManagerState>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((GameManagerState)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class GameManagerState>
	//    9   17:astore_1        
			if(getPlayers().size() != ((GameManagerState) (obj)).getPlayers().size())
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #83  <Method Collection getPlayers()>
	//*  12   22:invokeinterface #43  <Method int Collection.size()>
	//*  13   27:aload_1         
	//*  14   28:invokeinterface #84  <Method Collection GameManagerState.getPlayers()>
	//*  15   33:invokeinterface #43  <Method int Collection.size()>
	//*  16   38:icmpeq          43
				return false;
	//   17   41:iconst_0        
	//   18   42:ireturn         
			for(Iterator iterator = getPlayers().iterator(); iterator.hasNext();)
	//*  19   43:aload_0         
	//*  20   44:invokevirtual   #83  <Method Collection getPlayers()>
	//*  21   47:invokeinterface #52  <Method Iterator Collection.iterator()>
	//*  22   52:astore_3        
	//*  23   53:aload_3         
	//*  24   54:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  25   59:ifeq            153
			{
				PlayerInfo playerinfo = (PlayerInfo)iterator.next();
	//   26   62:aload_3         
	//   27   63:invokeinterface #62  <Method Object Iterator.next()>
	//   28   68:checkcast       #64  <Class PlayerInfo>
	//   29   71:astore          4
				Iterator iterator1 = ((GameManagerState) (obj)).getPlayers().iterator();
	//   30   73:aload_1         
	//   31   74:invokeinterface #84  <Method Collection GameManagerState.getPlayers()>
	//   32   79:invokeinterface #52  <Method Iterator Collection.iterator()>
	//   33   84:astore          5
				boolean flag = false;
	//   34   86:iconst_0        
	//   35   87:istore_2        
				do
				{
					if(!iterator1.hasNext())
						break;
	//   36   88:aload           5
	//   37   90:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   38   95:ifeq            147
					PlayerInfo playerinfo1 = (PlayerInfo)iterator1.next();
	//   39   98:aload           5
	//   40  100:invokeinterface #62  <Method Object Iterator.next()>
	//   41  105:checkcast       #64  <Class PlayerInfo>
	//   42  108:astore          6
					if(zzcu.zza(((Object) (playerinfo.getPlayerId())), ((Object) (playerinfo1.getPlayerId()))))
	//*  43  110:aload           4
	//*  44  112:invokeinterface #68  <Method String PlayerInfo.getPlayerId()>
	//*  45  117:aload           6
	//*  46  119:invokeinterface #68  <Method String PlayerInfo.getPlayerId()>
	//*  47  124:invokestatic    #90  <Method boolean zzcu.zza(Object, Object)>
	//*  48  127:ifeq            88
					{
						if(!zzcu.zza(((Object) (playerinfo)), ((Object) (playerinfo1))))
	//*  49  130:aload           4
	//*  50  132:aload           6
	//*  51  134:invokestatic    #90  <Method boolean zzcu.zza(Object, Object)>
	//*  52  137:ifne            142
							return false;
	//   53  140:iconst_0        
	//   54  141:ireturn         
						flag = true;
	//   55  142:iconst_1        
	//   56  143:istore_2        
					}
				} while(true);
	//   57  144:goto            88
				if(!flag)
	//*  58  147:iload_2         
	//*  59  148:ifne            53
					return false;
	//   60  151:iconst_0        
	//   61  152:ireturn         
			}

			if(zzuk == ((GameManagerState) (obj)).getLobbyState() && zzul == ((GameManagerState) (obj)).getGameplayState() && zztw == ((GameManagerState) (obj)).getMaxPlayers() && zzcu.zza(((Object) (zztv)), ((Object) (((GameManagerState) (obj)).getApplicationName()))) && zzcu.zza(((Object) (zzum)), ((Object) (((GameManagerState) (obj)).getGameStatusText()))) && JsonUtils.areJsonValuesEquivalent(((Object) (zzun)), ((Object) (((GameManagerState) (obj)).getGameData()))))
	//*  62  153:aload_0         
	//*  63  154:getfield        #25  <Field int zzuk>
	//*  64  157:aload_1         
	//*  65  158:invokeinterface #93  <Method int GameManagerState.getLobbyState()>
	//*  66  163:icmpne          242
	//*  67  166:aload_0         
	//*  68  167:getfield        #27  <Field int zzul>
	//*  69  170:aload_1         
	//*  70  171:invokeinterface #96  <Method int GameManagerState.getGameplayState()>
	//*  71  176:icmpne          242
	//*  72  179:aload_0         
	//*  73  180:getfield        #35  <Field int zztw>
	//*  74  183:aload_1         
	//*  75  184:invokeinterface #99  <Method int GameManagerState.getMaxPlayers()>
	//*  76  189:icmpne          242
	//*  77  192:aload_0         
	//*  78  193:getfield        #33  <Field String zztv>
	//*  79  196:aload_1         
	//*  80  197:invokeinterface #103 <Method CharSequence GameManagerState.getApplicationName()>
	//*  81  202:invokestatic    #90  <Method boolean zzcu.zza(Object, Object)>
	//*  82  205:ifeq            242
	//*  83  208:aload_0         
	//*  84  209:getfield        #29  <Field String zzum>
	//*  85  212:aload_1         
	//*  86  213:invokeinterface #106 <Method CharSequence GameManagerState.getGameStatusText()>
	//*  87  218:invokestatic    #90  <Method boolean zzcu.zza(Object, Object)>
	//*  88  221:ifeq            242
	//*  89  224:aload_0         
	//*  90  225:getfield        #31  <Field JSONObject zzun>
	//*  91  228:aload_1         
	//*  92  229:invokeinterface #110 <Method JSONObject GameManagerState.getGameData()>
	//*  93  234:invokestatic    #115 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//*  94  237:ifeq            242
				return true;
	//   95  240:iconst_1        
	//   96  241:ireturn         
		}
		return false;
	//   97  242:iconst_0        
	//   98  243:ireturn         
	}

	public final CharSequence getApplicationName()
	{
		return ((CharSequence) (zztv));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zztv>
	//    2    4:areturn         
	}

	public final List getConnectedControllablePlayers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = getPlayers().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method Collection getPlayers()>
	//    6   12:invokeinterface #52  <Method Iterator Collection.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            64
			PlayerInfo playerinfo = (PlayerInfo)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #62  <Method Object Iterator.next()>
	//   13   33:checkcast       #64  <Class PlayerInfo>
	//   14   36:astore_3        
			if(playerinfo.isConnected() && playerinfo.isControllable())
	//*  15   37:aload_3         
	//*  16   38:invokeinterface #123 <Method boolean PlayerInfo.isConnected()>
	//*  17   43:ifeq            18
	//*  18   46:aload_3         
	//*  19   47:invokeinterface #126 <Method boolean PlayerInfo.isControllable()>
	//*  20   52:ifeq            18
				arraylist.add(((Object) (playerinfo)));
	//   21   55:aload_1         
	//   22   56:aload_3         
	//   23   57:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   24   60:pop             
		} while(true);
	//   25   61:goto            18
		return ((List) (arraylist));
	//   26   64:aload_1         
	//   27   65:areturn         
	}

	public final List getConnectedPlayers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = getPlayers().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method Collection getPlayers()>
	//    6   12:invokeinterface #52  <Method Iterator Collection.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            55
			PlayerInfo playerinfo = (PlayerInfo)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #62  <Method Object Iterator.next()>
	//   13   33:checkcast       #64  <Class PlayerInfo>
	//   14   36:astore_3        
			if(playerinfo.isConnected())
	//*  15   37:aload_3         
	//*  16   38:invokeinterface #123 <Method boolean PlayerInfo.isConnected()>
	//*  17   43:ifeq            18
				arraylist.add(((Object) (playerinfo)));
	//   18   46:aload_1         
	//   19   47:aload_3         
	//   20   48:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   21   51:pop             
		} while(true);
	//   22   52:goto            18
		return ((List) (arraylist));
	//   23   55:aload_1         
	//   24   56:areturn         
	}

	public final List getControllablePlayers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = getPlayers().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method Collection getPlayers()>
	//    6   12:invokeinterface #52  <Method Iterator Collection.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            55
			PlayerInfo playerinfo = (PlayerInfo)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #62  <Method Object Iterator.next()>
	//   13   33:checkcast       #64  <Class PlayerInfo>
	//   14   36:astore_3        
			if(playerinfo.isControllable())
	//*  15   37:aload_3         
	//*  16   38:invokeinterface #126 <Method boolean PlayerInfo.isControllable()>
	//*  17   43:ifeq            18
				arraylist.add(((Object) (playerinfo)));
	//   18   46:aload_1         
	//   19   47:aload_3         
	//   20   48:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   21   51:pop             
		} while(true);
	//   22   52:goto            18
		return ((List) (arraylist));
	//   23   55:aload_1         
	//   24   56:areturn         
	}

	public final JSONObject getGameData()
	{
		return zzun;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JSONObject zzun>
	//    2    4:areturn         
	}

	public final CharSequence getGameStatusText()
	{
		return ((CharSequence) (zzum));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String zzum>
	//    2    4:areturn         
	}

	public final int getGameplayState()
	{
		return zzul;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int zzul>
	//    2    4:ireturn         
	}

	public final Collection getListOfChangedPlayers(GameManagerState gamemanagerstate)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #136 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void HashSet()>
	//    3    7:astore_2        
		Iterator iterator = getPlayers().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method Collection getPlayers()>
	//    6   12:invokeinterface #52  <Method Iterator Collection.iterator()>
	//    7   17:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_3         
	//    9   19:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            83
			PlayerInfo playerinfo1 = (PlayerInfo)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #62  <Method Object Iterator.next()>
	//   13   33:checkcast       #64  <Class PlayerInfo>
	//   14   36:astore          4
			PlayerInfo playerinfo2 = gamemanagerstate.getPlayer(playerinfo1.getPlayerId());
	//   15   38:aload_1         
	//   16   39:aload           4
	//   17   41:invokeinterface #68  <Method String PlayerInfo.getPlayerId()>
	//   18   46:invokeinterface #141 <Method PlayerInfo GameManagerState.getPlayer(String)>
	//   19   51:astore          5
			if(playerinfo2 == null || !((Object) (playerinfo1)).equals(((Object) (playerinfo2))))
	//*  20   53:aload           5
	//*  21   55:ifnull          68
	//*  22   58:aload           4
	//*  23   60:aload           5
	//*  24   62:invokevirtual   #143 <Method boolean Object.equals(Object)>
	//*  25   65:ifne            18
				hashset.add(((Object) (playerinfo1.getPlayerId())));
	//   26   68:aload_2         
	//   27   69:aload           4
	//   28   71:invokeinterface #68  <Method String PlayerInfo.getPlayerId()>
	//   29   76:invokevirtual   #144 <Method boolean HashSet.add(Object)>
	//   30   79:pop             
		} while(true);
	//   31   80:goto            18
		gamemanagerstate = ((GameManagerState) (gamemanagerstate.getPlayers().iterator()));
	//   32   83:aload_1         
	//   33   84:invokeinterface #84  <Method Collection GameManagerState.getPlayers()>
	//   34   89:invokeinterface #52  <Method Iterator Collection.iterator()>
	//   35   94:astore_1        
		do
		{
			if(!((Iterator) (gamemanagerstate)).hasNext())
				break;
	//   36   95:aload_1         
	//   37   96:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   38  101:ifeq            141
			PlayerInfo playerinfo = (PlayerInfo)((Iterator) (gamemanagerstate)).next();
	//   39  104:aload_1         
	//   40  105:invokeinterface #62  <Method Object Iterator.next()>
	//   41  110:checkcast       #64  <Class PlayerInfo>
	//   42  113:astore_3        
			if(getPlayer(playerinfo.getPlayerId()) == null)
	//*  43  114:aload_0         
	//*  44  115:aload_3         
	//*  45  116:invokeinterface #68  <Method String PlayerInfo.getPlayerId()>
	//*  46  121:invokevirtual   #145 <Method PlayerInfo getPlayer(String)>
	//*  47  124:ifnonnull       95
				hashset.add(((Object) (playerinfo.getPlayerId())));
	//   48  127:aload_2         
	//   49  128:aload_3         
	//   50  129:invokeinterface #68  <Method String PlayerInfo.getPlayerId()>
	//   51  134:invokevirtual   #144 <Method boolean HashSet.add(Object)>
	//   52  137:pop             
		} while(true);
	//   53  138:goto            95
		return ((Collection) (hashset));
	//   54  141:aload_2         
	//   55  142:areturn         
	}

	public final int getLobbyState()
	{
		return zzuk;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int zzuk>
	//    2    4:ireturn         
	}

	public final int getMaxPlayers()
	{
		return zztw;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int zztw>
	//    2    4:ireturn         
	}

	public final PlayerInfo getPlayer(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return (PlayerInfo)zzuo.get(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field Map zzuo>
	//    6   10:aload_1         
	//    7   11:invokeinterface #150 <Method Object Map.get(Object)>
	//    8   16:checkcast       #64  <Class PlayerInfo>
	//    9   19:areturn         
	}

	public final Collection getPlayers()
	{
		return Collections.unmodifiableCollection(zzuo.values());
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Map zzuo>
	//    2    4:invokeinterface #153 <Method Collection Map.values()>
	//    3    9:invokestatic    #159 <Method Collection Collections.unmodifiableCollection(Collection)>
	//    4   12:areturn         
	}

	public final List getPlayersInState(int i)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #119 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void ArrayList()>
	//    3    7:astore_2        
		Iterator iterator = getPlayers().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method Collection getPlayers()>
	//    6   12:invokeinterface #52  <Method Iterator Collection.iterator()>
	//    7   17:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_3         
	//    9   19:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            59
			PlayerInfo playerinfo = (PlayerInfo)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #62  <Method Object Iterator.next()>
	//   13   33:checkcast       #64  <Class PlayerInfo>
	//   14   36:astore          4
			if(playerinfo.getPlayerState() == i)
	//*  15   38:aload           4
	//*  16   40:invokeinterface #165 <Method int PlayerInfo.getPlayerState()>
	//*  17   45:iload_1         
	//*  18   46:icmpne          18
				arraylist.add(((Object) (playerinfo)));
	//   19   49:aload_2         
	//   20   50:aload           4
	//   21   52:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   22   55:pop             
		} while(true);
	//   23   56:goto            18
		return ((List) (arraylist));
	//   24   59:aload_2         
	//   25   60:areturn         
	}

	public final boolean hasGameDataChanged(GameManagerState gamemanagerstate)
	{
		return !JsonUtils.areJsonValuesEquivalent(((Object) (zzun)), ((Object) (gamemanagerstate.getGameData())));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JSONObject zzun>
	//    2    4:aload_1         
	//    3    5:invokeinterface #110 <Method JSONObject GameManagerState.getGameData()>
	//    4   10:invokestatic    #115 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//    5   13:ifne            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public final boolean hasGameStatusTextChanged(GameManagerState gamemanagerstate)
	{
		return !zzcu.zza(((Object) (zzum)), ((Object) (gamemanagerstate.getGameStatusText())));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String zzum>
	//    2    4:aload_1         
	//    3    5:invokeinterface #106 <Method CharSequence GameManagerState.getGameStatusText()>
	//    4   10:invokestatic    #90  <Method boolean zzcu.zza(Object, Object)>
	//    5   13:ifne            18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public final boolean hasGameplayStateChanged(GameManagerState gamemanagerstate)
	{
		return zzul != gamemanagerstate.getGameplayState();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int zzul>
	//    2    4:aload_1         
	//    3    5:invokeinterface #96  <Method int GameManagerState.getGameplayState()>
	//    4   10:icmpeq          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final boolean hasLobbyStateChanged(GameManagerState gamemanagerstate)
	{
		return zzuk != gamemanagerstate.getLobbyState();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int zzuk>
	//    2    4:aload_1         
	//    3    5:invokeinterface #93  <Method int GameManagerState.getLobbyState()>
	//    4   10:icmpeq          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final boolean hasPlayerChanged(String s, GameManagerState gamemanagerstate)
	{
		return !zzcu.zza(((Object) (getPlayer(s))), ((Object) (gamemanagerstate.getPlayer(s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method PlayerInfo getPlayer(String)>
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokeinterface #141 <Method PlayerInfo GameManagerState.getPlayer(String)>
	//    6   12:invokestatic    #90  <Method boolean zzcu.zza(Object, Object)>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public final boolean hasPlayerDataChanged(String s, GameManagerState gamemanagerstate)
	{
		PlayerInfo playerinfo = getPlayer(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method PlayerInfo getPlayer(String)>
	//    3    5:astore_3        
		s = ((String) (gamemanagerstate.getPlayer(s)));
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokeinterface #141 <Method PlayerInfo GameManagerState.getPlayer(String)>
	//    7   13:astore_1        
		if(playerinfo == null && s == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       24
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		if(playerinfo != null && s != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          54
	//*  16   28:aload_1         
	//*  17   29:ifnull          54
			return !JsonUtils.areJsonValuesEquivalent(((Object) (playerinfo.getPlayerData())), ((Object) (((PlayerInfo) (s)).getPlayerData())));
	//   18   32:aload_3         
	//   19   33:invokeinterface #177 <Method JSONObject PlayerInfo.getPlayerData()>
	//   20   38:aload_1         
	//   21   39:invokeinterface #177 <Method JSONObject PlayerInfo.getPlayerData()>
	//   22   44:invokestatic    #115 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//   23   47:ifne            52
	//   24   50:iconst_1        
	//   25   51:ireturn         
	//   26   52:iconst_0        
	//   27   53:ireturn         
		else
			return true;
	//   28   54:iconst_1        
	//   29   55:ireturn         
	}

	public final boolean hasPlayerStateChanged(String s, GameManagerState gamemanagerstate)
	{
		PlayerInfo playerinfo = getPlayer(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method PlayerInfo getPlayer(String)>
	//    3    5:astore_3        
		s = ((String) (gamemanagerstate.getPlayer(s)));
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokeinterface #141 <Method PlayerInfo GameManagerState.getPlayer(String)>
	//    7   13:astore_1        
		if(playerinfo == null && s == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       24
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		if(playerinfo != null && s != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          51
	//*  16   28:aload_1         
	//*  17   29:ifnull          51
			return playerinfo.getPlayerState() != ((PlayerInfo) (s)).getPlayerState();
	//   18   32:aload_3         
	//   19   33:invokeinterface #165 <Method int PlayerInfo.getPlayerState()>
	//   20   38:aload_1         
	//   21   39:invokeinterface #165 <Method int PlayerInfo.getPlayerState()>
	//   22   44:icmpeq          49
	//   23   47:iconst_1        
	//   24   48:ireturn         
	//   25   49:iconst_0        
	//   26   50:ireturn         
		else
			return true;
	//   27   51:iconst_1        
	//   28   52:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzuk), Integer.valueOf(zzul), zzuo, zzum, zzun, zztv, Integer.valueOf(zztw)
		});
	//    0    0:bipush          7
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field int zzuk>
	//    6   11:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #27  <Field int zzul>
	//   12   21:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #48  <Field Map zzuo>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_3        
	//   21   34:aload_0         
	//   22   35:getfield        #29  <Field String zzum>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #31  <Field JSONObject zzun>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:aload_0         
	//   32   49:getfield        #33  <Field String zztv>
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:bipush          6
	//   36   56:aload_0         
	//   37   57:getfield        #35  <Field int zztw>
	//   38   60:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//   39   63:aastore         
	//   40   64:invokestatic    #190 <Method int Objects.hashCode(Object[])>
	//   41   67:ireturn         
	}

	private final String zztv;
	private final int zztw;
	private final int zzuk;
	private final int zzul;
	private final String zzum;
	private final JSONObject zzun;
	private final Map zzuo;
}
