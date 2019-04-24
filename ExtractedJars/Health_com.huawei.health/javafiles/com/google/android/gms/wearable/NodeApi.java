// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.*;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//			Node

public interface NodeApi
{
	public static interface GetConnectedNodesResult
		extends Result
	{

		public abstract List getNodes();
	}

	public static interface GetLocalNodeResult
		extends Result
	{

		public abstract Node getNode();
	}

	public static interface NodeListener
	{

		public abstract void onPeerConnected(Node node);

		public abstract void onPeerDisconnected(Node node);
	}


	public abstract PendingResult addListener(GoogleApiClient googleapiclient, NodeListener nodelistener);

	public abstract PendingResult getConnectedNodes(GoogleApiClient googleapiclient);

	public abstract PendingResult getLocalNode(GoogleApiClient googleapiclient);

	public abstract PendingResult removeListener(GoogleApiClient googleapiclient, NodeListener nodelistener);
}
