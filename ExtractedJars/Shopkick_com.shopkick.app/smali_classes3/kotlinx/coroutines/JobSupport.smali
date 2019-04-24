.class public Lkotlinx/coroutines/JobSupport;
.super Ljava/lang/Object;
.source "JobSupport.kt"

# interfaces
.implements Lkotlinx/coroutines/Job;
.implements Lkotlinx/coroutines/ChildJob;
.implements Lkotlinx/coroutines/ParentJob;
.implements Lkotlinx/coroutines/selects/SelectClause0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/JobSupport$Finishing;,
        Lkotlinx/coroutines/JobSupport$ChildCompletion;,
        Lkotlinx/coroutines/JobSupport$AwaitContinuation;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 6 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 7 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 8 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 10 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1319:1\n314#1,2:1326\n316#1,4:1331\n320#1,4:1336\n324#1,2:1343\n314#1,2:1345\n316#1,4:1350\n320#1,4:1355\n324#1,2:1362\n173#1,2:1371\n173#1,2:1373\n173#1,2:1375\n173#1,2:1390\n173#1,2:1399\n173#1,2:1402\n173#1,2:1404\n173#1,2:1406\n173#1,2:1409\n173#1,2:1411\n173#1,2:1417\n96#2,2:1320\n12#3:1322\n12#3:1377\n12#3:1408\n12#3:1413\n241#4,2:1323\n68#5:1325\n68#5:1335\n68#5:1354\n68#5:1367\n677#6,3:1328\n680#6,3:1340\n677#6,3:1347\n680#6,3:1359\n677#6,3:1364\n680#6,3:1368\n47#7:1378\n22#8:1379\n22#8:1380\n13#8:1396\n13#8:1401\n13#8:1414\n13#8:1415\n13#8:1416\n13#8:1419\n148#9:1381\n84#9,3:1382\n149#9,5:1385\n154#10,4:1392\n158#10,2:1397\n*E\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n305#1,2:1326\n305#1,4:1331\n305#1,4:1336\n305#1,2:1343\n311#1,2:1345\n311#1,4:1350\n311#1,4:1355\n311#1,2:1362\n328#1,2:1371\n385#1,2:1373\n405#1,2:1375\n496#1,2:1390\n513#1,2:1399\n536#1,2:1402\n593#1,2:1404\n641#1,2:1406\n714#1,2:1409\n734#1,2:1411\n1108#1,2:1417\n163#1,2:1320\n202#1:1322\n405#1:1377\n641#1:1408\n766#1:1413\n237#1,2:1323\n246#1:1325\n305#1:1335\n311#1:1354\n315#1:1367\n305#1,3:1328\n305#1,3:1340\n311#1,3:1347\n311#1,3:1359\n315#1,3:1364\n315#1,3:1368\n405#1:1378\n405#1:1379\n405#1:1380\n502#1:1396\n513#1:1401\n809#1:1414\n859#1:1415\n1089#1:1416\n1108#1:1419\n469#1:1381\n469#1,3:1382\n469#1,5:1385\n502#1,4:1392\n502#1,2:1397\n*E\n"
.end annotation

.annotation runtime Lkotlin/Deprecated;
    level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
    message = "This is internal API and may be removed in the future releases"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u00e8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0001\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u00a4\u0001\u00a5\u0001\u00a6\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J$\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u0002002\n\u00101\u001a\u0006\u0012\u0002\u0008\u000302H\u0002J\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0002J\u0015\u00105\u001a\u0004\u0018\u00010\nH\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u00107J\u0013\u00108\u001a\u0004\u0018\u00010\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0008\u00109\u001a\u00020:H\u0016J\u0012\u00109\u001a\u00020\u00062\u0008\u0010;\u001a\u0004\u0018\u00010\'H\u0016J\u0012\u0010<\u001a\u00020\u00062\u0008\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010=\u001a\u00020\u00062\u0008\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\'H\u0002J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\'H\u0016J*\u0010@\u001a\u00020:2\u0006\u0010#\u001a\u00020+2\u0008\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0006H\u0002J\"\u0010E\u001a\u00020:2\u0006\u0010#\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0008\u0010I\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010J\u001a\u00020\'2\u0008\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0008\u0010K\u001a\u00020LH\u0002J\u0012\u0010M\u001a\u0004\u0018\u00010H2\u0006\u0010#\u001a\u00020+H\u0002J\n\u0010N\u001a\u00060Oj\u0002`PJ\u0008\u0010Q\u001a\u00020\'H\u0016J\u000f\u0010R\u001a\u0004\u0018\u00010\nH\u0000\u00a2\u0006\u0002\u0008SJ\n\u0010T\u001a\u0004\u0018\u00010\'H\u0004J\u0008\u0010U\u001a\u0004\u0018\u00010\'J \u0010V\u001a\u0004\u0018\u00010\'2\u0006\u0010#\u001a\u00020F2\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020\'0XH\u0002J\u0012\u0010Y\u001a\u0004\u0018\u0001002\u0006\u0010#\u001a\u00020+H\u0002J\u0010\u0010Z\u001a\u00020:2\u0006\u0010[\u001a\u00020\'H\u0014J\u0015\u0010\\\u001a\u00020:2\u0006\u0010[\u001a\u00020\'H\u0010\u00a2\u0006\u0002\u0008]J\u0017\u0010^\u001a\u00020:2\u0008\u0010_\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0002\u0008`J?\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00062\'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\u000c\u0008g\u0012\u0008\u0008h\u0012\u0004\u0008\u0008(;\u0012\u0004\u0012\u00020:0fj\u0002`iJ/\u0010a\u001a\u00020b2\'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\u000c\u0008g\u0012\u0008\u0008h\u0012\u0004\u0008\u0008(;\u0012\u0004\u0012\u00020:0fj\u0002`iJ\u0011\u0010j\u001a\u00020:H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0008\u0010k\u001a\u00020\u0006H\u0002J\u0011\u0010l\u001a\u00020:H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u001f\u0010m\u001a\u00020n2\u0014\u0010o\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020:0fH\u0082\u0008J\u0012\u0010p\u001a\u00020\u00062\u0008\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0017\u0010q\u001a\u00020\u00062\u0008\u0010I\u001a\u0004\u0018\u00010\nH\u0000\u00a2\u0006\u0002\u0008rJ\u001f\u0010s\u001a\u00020\u00062\u0008\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0000\u00a2\u0006\u0002\u0008tJ=\u0010u\u001a\u0006\u0012\u0002\u0008\u0003022\'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\'\u00a2\u0006\u000c\u0008g\u0012\u0008\u0008h\u0012\u0004\u0008\u0008(;\u0012\u0004\u0012\u00020:0fj\u0002`i2\u0006\u0010c\u001a\u00020\u0006H\u0002J\r\u0010v\u001a\u00020wH\u0010\u00a2\u0006\u0002\u0008xJ\u0018\u0010y\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010;\u001a\u00020\'H\u0002J+\u0010z\u001a\u00020:\"\u000e\u0008\u0000\u0010{\u0018\u0001*\u0006\u0012\u0002\u0008\u0003022\u0006\u0010/\u001a\u0002002\u0008\u0010;\u001a\u0004\u0018\u00010\'H\u0082\u0008J\u0012\u0010|\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010\'H\u0014J\'\u0010}\u001a\u00020:2\u0008\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0006H\u0010\u00a2\u0006\u0002\u0008~J\u000e\u0010\u007f\u001a\u00020:H\u0010\u00a2\u0006\u0003\u0008\u0080\u0001J\u0010\u0010\u0081\u0001\u001a\u00020:2\u0007\u0010\u0082\u0001\u001a\u00020\u0003J\u0012\u0010\u0083\u0001\u001a\u00020:2\u0007\u0010#\u001a\u00030\u0084\u0001H\u0002J\u0015\u0010\u0085\u0001\u001a\u00020:2\n\u0010#\u001a\u0006\u0012\u0002\u0008\u000302H\u0002JH\u0010\u0086\u0001\u001a\u00020:\"\u0005\u0008\u0000\u0010\u0087\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0087\u00010\u0089\u00012\u001e\u0010o\u001a\u001a\u0008\u0001\u0012\u000c\u0012\n\u0012\u0005\u0012\u0003H\u0087\u00010\u008a\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0f\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008b\u0001JZ\u0010\u008c\u0001\u001a\u00020:\"\u0004\u0008\u0000\u0010{\"\u0005\u0008\u0001\u0010\u0087\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0087\u00010\u0089\u00012%\u0010o\u001a!\u0008\u0001\u0012\u0004\u0012\u0002H{\u0012\u000c\u0012\n\u0012\u0005\u0012\u0003H\u0087\u00010\u008a\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\u008d\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u00020:2\n\u00101\u001a\u0006\u0012\u0002\u0008\u000302H\u0000\u00a2\u0006\u0003\u0008\u0091\u0001JZ\u0010\u0092\u0001\u001a\u00020:\"\u0004\u0008\u0000\u0010{\"\u0005\u0008\u0001\u0010\u0087\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0087\u00010\u0089\u00012%\u0010o\u001a!\u0008\u0001\u0012\u0004\u0012\u0002H{\u0012\u000c\u0012\n\u0012\u0005\u0012\u0003H\u0087\u00010\u008a\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\u008d\u0001H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u008f\u0001J\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0013\u0010\u0095\u0001\u001a\u00020C2\u0008\u0010#\u001a\u0004\u0018\u00010\nH\u0002J\u0013\u0010\u0096\u0001\u001a\u00020w2\u0008\u0010#\u001a\u0004\u0018\u00010\nH\u0002J \u0010\u0097\u0001\u001a\u00020\u00062\u0007\u0010\u0098\u0001\u001a\u00020\'2\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020\'0XH\u0002J\t\u0010\u0099\u0001\u001a\u00020wH\u0016J#\u0010\u009a\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020F2\u0008\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J#\u0010\u009b\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020+2\u0008\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J\u001a\u0010\u009c\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020+2\u0007\u0010\u0098\u0001\u001a\u00020\'H\u0002J%\u0010\u009d\u0001\u001a\u00020C2\u0008\u0010#\u001a\u0004\u0018\u00010\n2\u0008\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J$\u0010\u009e\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020F2\u0006\u00104\u001a\u00020H2\u0008\u0010I\u001a\u0004\u0018\u00010\nH\u0082\u0010J\u0010\u0010\u009f\u0001\u001a\u0004\u0018\u00010H*\u00030\u00a0\u0001H\u0002J\u0017\u0010\u00a1\u0001\u001a\u00020:*\u0002002\u0008\u0010;\u001a\u0004\u0018\u00010\'H\u0002J\u001a\u0010\u00a2\u0001\u001a\u00060Oj\u0002`P*\u00020\'2\u0007\u0010\u00a3\u0001\u001a\u00020wH\u0002R\u0016\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\rR\u0015\u0010\u0018\u001a\u0006\u0012\u0002\u0008\u00030\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\'*\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0018\u0010*\u001a\u00020\u0006*\u00020+8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010,\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u00a7\u0001"
    }
    d2 = {
        "Lkotlinx/coroutines/JobSupport;",
        "Lkotlinx/coroutines/Job;",
        "Lkotlinx/coroutines/ChildJob;",
        "Lkotlinx/coroutines/ParentJob;",
        "Lkotlinx/coroutines/selects/SelectClause0;",
        "active",
        "",
        "(Z)V",
        "_state",
        "Lkotlinx/atomicfu/AtomicRef;",
        "",
        "cancelsParent",
        "getCancelsParent",
        "()Z",
        "children",
        "Lkotlin/sequences/Sequence;",
        "getChildren",
        "()Lkotlin/sequences/Sequence;",
        "handlesException",
        "getHandlesException",
        "isActive",
        "isCancelled",
        "isCompleted",
        "isCompletedExceptionally",
        "key",
        "Lkotlin/coroutines/CoroutineContext$Key;",
        "getKey",
        "()Lkotlin/coroutines/CoroutineContext$Key;",
        "onCancelComplete",
        "getOnCancelComplete$kotlinx_coroutines_core",
        "onJoin",
        "getOnJoin",
        "()Lkotlinx/coroutines/selects/SelectClause0;",
        "parentHandle",
        "Lkotlinx/coroutines/ChildHandle;",
        "state",
        "getState$kotlinx_coroutines_core",
        "()Ljava/lang/Object;",
        "exceptionOrNull",
        "",
        "getExceptionOrNull",
        "(Ljava/lang/Object;)Ljava/lang/Throwable;",
        "isCancelling",
        "Lkotlinx/coroutines/Incomplete;",
        "(Lkotlinx/coroutines/Incomplete;)Z",
        "addLastAtomic",
        "expect",
        "list",
        "Lkotlinx/coroutines/NodeList;",
        "node",
        "Lkotlinx/coroutines/JobNode;",
        "attachChild",
        "child",
        "awaitInternal",
        "awaitInternal$kotlinx_coroutines_core",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "awaitSuspend",
        "cancel",
        "",
        "cause",
        "cancelImpl",
        "cancelMakeCompleting",
        "cancelParent",
        "childCancelled",
        "completeStateFinalization",
        "update",
        "mode",
        "",
        "suppressed",
        "continueCompleting",
        "Lkotlinx/coroutines/JobSupport$Finishing;",
        "lastChild",
        "Lkotlinx/coroutines/ChildHandleNode;",
        "proposedUpdate",
        "createCauseException",
        "createJobCancellationException",
        "Lkotlinx/coroutines/JobCancellationException;",
        "firstChild",
        "getCancellationException",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "getChildJobCancellationCause",
        "getCompletedInternal",
        "getCompletedInternal$kotlinx_coroutines_core",
        "getCompletionCause",
        "getCompletionExceptionOrNull",
        "getFinalRootCause",
        "exceptions",
        "",
        "getOrPromoteCancellingList",
        "handleJobException",
        "exception",
        "handleOnCompletionException",
        "handleOnCompletionException$kotlinx_coroutines_core",
        "initParentJobInternal",
        "parent",
        "initParentJobInternal$kotlinx_coroutines_core",
        "invokeOnCompletion",
        "Lkotlinx/coroutines/DisposableHandle;",
        "onCancelling",
        "invokeImmediately",
        "handler",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "Lkotlinx/coroutines/CompletionHandler;",
        "join",
        "joinInternal",
        "joinSuspend",
        "loopOnState",
        "",
        "block",
        "makeCancelling",
        "makeCompleting",
        "makeCompleting$kotlinx_coroutines_core",
        "makeCompletingOnce",
        "makeCompletingOnce$kotlinx_coroutines_core",
        "makeNode",
        "nameString",
        "",
        "nameString$kotlinx_coroutines_core",
        "notifyCancelling",
        "notifyHandlers",
        "T",
        "onCancellation",
        "onCompletionInternal",
        "onCompletionInternal$kotlinx_coroutines_core",
        "onStartInternal",
        "onStartInternal$kotlinx_coroutines_core",
        "parentCancelled",
        "parentJob",
        "promoteEmptyToNodeList",
        "Lkotlinx/coroutines/Empty;",
        "promoteSingleToNodeList",
        "registerSelectClause0",
        "R",
        "select",
        "Lkotlinx/coroutines/selects/SelectInstance;",
        "Lkotlin/coroutines/Continuation;",
        "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V",
        "registerSelectClause1Internal",
        "Lkotlin/Function2;",
        "registerSelectClause1Internal$kotlinx_coroutines_core",
        "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V",
        "removeNode",
        "removeNode$kotlinx_coroutines_core",
        "selectAwaitCompletion",
        "selectAwaitCompletion$kotlinx_coroutines_core",
        "start",
        "startInternal",
        "stateString",
        "suppressExceptions",
        "rootCause",
        "toString",
        "tryFinalizeFinishingState",
        "tryFinalizeSimpleState",
        "tryMakeCancelling",
        "tryMakeCompleting",
        "tryWaitForChild",
        "nextChild",
        "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;",
        "notifyCompletion",
        "toCancellationException",
        "message",
        "AwaitContinuation",
        "ChildCompletion",
        "Finishing",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final _state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _state:Ljava/lang/Object;

.field private volatile parentHandle:Lkotlinx/coroutines/ChildHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lkotlinx/coroutines/JobSupport;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 127
    invoke-static {}, Lkotlinx/coroutines/JobSupportKt;->access$getEMPTY_ACTIVE$p()Lkotlinx/coroutines/Empty;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlinx/coroutines/JobSupportKt;->access$getEMPTY_NEW$p()Lkotlinx/coroutines/Empty;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lkotlinx/coroutines/JobSupport;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$continueCompleting(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/JobSupport$Finishing;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/ChildHandleNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lkotlinx/coroutines/JobSupport;->continueCompleting(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V

    return-void
.end method

.method private final addLastAtomic(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlinx/coroutines/NodeList;",
            "Lkotlinx/coroutines/JobNode<",
            "*>;)Z"
        }
    .end annotation

    .line 1382
    new-instance v0, Lkotlinx/coroutines/JobSupport$addLastAtomic$$inlined$addLastIf$1;

    check-cast p3, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {v0, p3, p3, p0, p1}, Lkotlinx/coroutines/JobSupport$addLastAtomic$$inlined$addLastIf$1;-><init>(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/JobSupport;Ljava/lang/Object;)V

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;

    .line 1386
    :goto_0
    invoke-virtual {p2}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrev()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 1387
    invoke-virtual {p1, p3, p2, v0}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->tryCondAddNext(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    goto :goto_1

    :pswitch_1
    const/4 p1, 0x1

    :goto_1
    return p1

    .line 1386
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final cancelImpl(Ljava/lang/Object;)Z
    .locals 1

    .line 582
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getOnCancelComplete$kotlinx_coroutines_core()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 585
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->cancelMakeCompleting(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 588
    :cond_0
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->makeCancelling(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final cancelMakeCompleting(Ljava/lang/Object;)Z
    .locals 4

    .line 1405
    :pswitch_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 594
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    instance-of v1, v0, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/JobSupport$Finishing;

    iget-boolean v1, v1, Lkotlinx/coroutines/JobSupport$Finishing;->isCompleting:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 597
    :cond_0
    new-instance v1, Lkotlinx/coroutines/CompletedExceptionally;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->createCauseException(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    invoke-direct {v1, v3}, Lkotlinx/coroutines/CompletedExceptionally;-><init>(Ljava/lang/Throwable;)V

    .line 598
    invoke-direct {p0, v0, v1, v2}, Lkotlinx/coroutines/JobSupport;->tryMakeCompleting(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 602
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unexpected result"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    const/4 p1, 0x1

    return p1

    :pswitch_2
    return v2

    :cond_1
    :goto_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final cancelParent(Ljava/lang/Throwable;)Z
    .locals 3

    .line 910
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 911
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getCancelsParent()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 912
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/JobSupport;->parentHandle:Lkotlinx/coroutines/ChildHandle;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lkotlinx/coroutines/ChildHandle;->childCancelled(Ljava/lang/Throwable;)Z

    move-result p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    return v1
.end method

.method private final completeStateFinalization(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;IZ)V
    .locals 4

    .line 270
    iget-object v0, p0, Lkotlinx/coroutines/JobSupport;->parentHandle:Lkotlinx/coroutines/ChildHandle;

    if-eqz v0, :cond_0

    .line 271
    invoke-interface {v0}, Lkotlinx/coroutines/ChildHandle;->dispose()V

    .line 272
    sget-object v0, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast v0, Lkotlinx/coroutines/ChildHandle;

    iput-object v0, p0, Lkotlinx/coroutines/JobSupport;->parentHandle:Lkotlinx/coroutines/ChildHandle;

    .line 274
    :cond_0
    instance-of v0, p2, Lkotlinx/coroutines/CompletedExceptionally;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    .line 280
    :cond_2
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->isCancelling(Lkotlinx/coroutines/Incomplete;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, v1}, Lkotlinx/coroutines/JobSupport;->onCancellation(Ljava/lang/Throwable;)V

    .line 285
    :cond_3
    instance-of v0, p1, Lkotlinx/coroutines/JobNode;

    if-eqz v0, :cond_4

    .line 287
    :try_start_0
    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/JobNode;

    invoke-virtual {v0, v1}, Lkotlinx/coroutines/JobNode;->invoke(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 289
    new-instance v1, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception in completion handler "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v1, Ljava/lang/Throwable;

    invoke-virtual {p0, v1}, Lkotlinx/coroutines/JobSupport;->handleOnCompletionException$kotlinx_coroutines_core(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 292
    :cond_4
    invoke-interface {p1}, Lkotlinx/coroutines/Incomplete;->getList()Lkotlinx/coroutines/NodeList;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-direct {p0, p1, v1}, Lkotlinx/coroutines/JobSupport;->notifyCompletion(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V

    .line 299
    :cond_5
    :goto_1
    invoke-virtual {p0, p2, p3, p4}, Lkotlinx/coroutines/JobSupport;->onCompletionInternal$kotlinx_coroutines_core(Ljava/lang/Object;IZ)V

    return-void
.end method

.method private final continueCompleting(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V
    .locals 2

    .line 818
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_3

    .line 820
    check-cast p2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {p0, p2}, Lkotlinx/coroutines/JobSupport;->nextChild(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 822
    invoke-direct {p0, p1, p2, p3}, Lkotlinx/coroutines/JobSupport;->tryWaitForChild(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-void

    .line 824
    :cond_1
    invoke-direct {p0, p1, p3, v1}, Lkotlinx/coroutines/JobSupport;->tryFinalizeFinishingState(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;I)Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    return-void

    .line 818
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method private final createCauseException(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 1

    if-eqz p1, :cond_0

    .line 633
    instance-of v0, p1, Ljava/lang/Throwable;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lkotlinx/coroutines/JobSupport;->createJobCancellationException()Lkotlinx/coroutines/JobCancellationException;

    move-result-object p1

    :goto_1
    check-cast p1, Ljava/lang/Throwable;

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    .line 634
    check-cast p1, Lkotlinx/coroutines/ParentJob;

    invoke-interface {p1}, Lkotlinx/coroutines/ParentJob;->getChildJobCancellationCause()Ljava/lang/Throwable;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final createJobCancellationException()Lkotlinx/coroutines/JobCancellationException;
    .locals 4

    .line 608
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    const-string v1, "Job was cancelled"

    move-object v2, p0

    check-cast v2, Lkotlinx/coroutines/Job;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V

    return-object v0
.end method

.method private final firstChild(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;
    .locals 2

    .line 802
    instance-of v0, p1, Lkotlinx/coroutines/ChildHandleNode;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    check-cast v0, Lkotlinx/coroutines/ChildHandleNode;

    if-eqz v0, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lkotlinx/coroutines/Incomplete;->getList()Lkotlinx/coroutines/NodeList;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->nextChild(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;

    move-result-object v1

    :cond_2
    :goto_1
    return-object v1
.end method

.method private final getExceptionOrNull(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 799
    instance-of v0, p1, Lkotlinx/coroutines/CompletedExceptionally;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    :cond_0
    check-cast p1, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz p1, :cond_1

    iget-object v1, p1, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method private final getFinalRootCause(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/JobSupport$Finishing;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .line 231
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 233
    invoke-virtual {p1}, Lkotlinx/coroutines/JobSupport$Finishing;->isCancelling()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lkotlinx/coroutines/JobSupport;->createJobCancellationException()Lkotlinx/coroutines/JobCancellationException;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1

    :cond_0
    return-object v1

    .line 237
    :cond_1
    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    .line 1323
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    .line 237
    instance-of v3, v3, Ljava/util/concurrent/CancellationException;

    if-nez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    move v3, v2

    :goto_0
    if-eqz v3, :cond_2

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 1324
    :goto_1
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_5

    goto :goto_2

    .line 237
    :cond_5
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Throwable;

    :goto_2
    return-object v0
.end method

.method private final getOrPromoteCancellingList(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;
    .locals 2

    .line 682
    invoke-interface {p1}, Lkotlinx/coroutines/Incomplete;->getList()Lkotlinx/coroutines/NodeList;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 684
    :cond_0
    instance-of v0, p1, Lkotlinx/coroutines/Empty;

    if-eqz v0, :cond_1

    new-instance v0, Lkotlinx/coroutines/NodeList;

    invoke-direct {v0}, Lkotlinx/coroutines/NodeList;-><init>()V

    goto :goto_0

    .line 685
    :cond_1
    instance-of v0, p1, Lkotlinx/coroutines/JobNode;

    if-eqz v0, :cond_2

    .line 688
    check-cast p1, Lkotlinx/coroutines/JobNode;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->promoteSingleToNodeList(Lkotlinx/coroutines/JobNode;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 691
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "State should have list: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method private final isCancelling(Lkotlinx/coroutines/Incomplete;)Z
    .locals 1
    .param p1    # Lkotlinx/coroutines/Incomplete;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1010
    instance-of v0, p1, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-virtual {p1}, Lkotlinx/coroutines/JobSupport$Finishing;->isCancelling()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final joinInternal()Z
    .locals 2

    .line 1391
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 497
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    .line 498
    :cond_1
    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->startInternal(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0
.end method

.method private final loopOnState(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    .line 174
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private final makeCancelling(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    .line 640
    move-object v1, v0

    check-cast v1, Ljava/lang/Throwable;

    .line 1407
    :cond_0
    :pswitch_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v2

    .line 643
    instance-of v3, v2, Lkotlinx/coroutines/JobSupport$Finishing;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_7

    .line 1408
    monitor-enter v2

    .line 645
    :try_start_0
    move-object v3, v2

    check-cast v3, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-virtual {v3}, Lkotlinx/coroutines/JobSupport$Finishing;->isSealed()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    monitor-exit v2

    return v4

    .line 647
    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-virtual {v3}, Lkotlinx/coroutines/JobSupport$Finishing;->isCancelling()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-eqz v1, :cond_3

    goto :goto_0

    .line 650
    :cond_3
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->createCauseException(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    .line 651
    :goto_0
    move-object p1, v2

    check-cast p1, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-virtual {p1, v1}, Lkotlinx/coroutines/JobSupport$Finishing;->addExceptionLocked(Ljava/lang/Throwable;)V

    .line 654
    :cond_4
    move-object p1, v2

    check-cast p1, Lkotlinx/coroutines/JobSupport$Finishing;

    iget-object p1, p1, Lkotlinx/coroutines/JobSupport$Finishing;->rootCause:Ljava/lang/Throwable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    move-object p1, v0

    :goto_1
    monitor-exit v2

    if-eqz p1, :cond_6

    .line 656
    check-cast v2, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-virtual {v2}, Lkotlinx/coroutines/JobSupport$Finishing;->getList()Lkotlinx/coroutines/NodeList;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lkotlinx/coroutines/JobSupport;->notifyCancelling(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V

    :cond_6
    return v5

    :catchall_0
    move-exception p1

    .line 654
    monitor-exit v2

    throw p1

    .line 659
    :cond_7
    instance-of v3, v2, Lkotlinx/coroutines/Incomplete;

    if-eqz v3, :cond_a

    if-eqz v1, :cond_8

    goto :goto_2

    .line 661
    :cond_8
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->createCauseException(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    .line 662
    :goto_2
    move-object v3, v2

    check-cast v3, Lkotlinx/coroutines/Incomplete;

    invoke-interface {v3}, Lkotlinx/coroutines/Incomplete;->isActive()Z

    move-result v6

    if-eqz v6, :cond_9

    .line 664
    invoke-direct {p0, v3, v1}, Lkotlinx/coroutines/JobSupport;->tryMakeCancelling(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v5

    .line 667
    :cond_9
    new-instance v3, Lkotlinx/coroutines/CompletedExceptionally;

    invoke-direct {v3, v1}, Lkotlinx/coroutines/CompletedExceptionally;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p0, v2, v3, v4}, Lkotlinx/coroutines/JobSupport;->tryMakeCompleting(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 671
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unexpected result"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    return v5

    .line 668
    :pswitch_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot happen in "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :cond_a
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final makeNode(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;Z)",
            "Lkotlinx/coroutines/JobNode<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    .line 461
    instance-of p2, p1, Lkotlinx/coroutines/JobCancellingNode;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    check-cast v2, Lkotlinx/coroutines/JobCancellingNode;

    if-eqz v2, :cond_3

    iget-object p2, v2, Lkotlinx/coroutines/JobCancellingNode;->job:Lkotlinx/coroutines/Job;

    move-object v3, p0

    check-cast v3, Lkotlinx/coroutines/JobSupport;

    if-ne p2, v3, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v2, :cond_3

    check-cast v2, Lkotlinx/coroutines/JobNode;

    goto :goto_4

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 462
    :cond_3
    new-instance p2, Lkotlinx/coroutines/InvokeOnCancelling;

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/Job;

    invoke-direct {p2, v0, p1}, Lkotlinx/coroutines/InvokeOnCancelling;-><init>(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function1;)V

    move-object v2, p2

    check-cast v2, Lkotlinx/coroutines/JobNode;

    goto :goto_4

    .line 464
    :cond_4
    instance-of p2, p1, Lkotlinx/coroutines/JobNode;

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, p1

    :goto_2
    check-cast v2, Lkotlinx/coroutines/JobNode;

    if-eqz v2, :cond_8

    iget-object p2, v2, Lkotlinx/coroutines/JobNode;->job:Lkotlinx/coroutines/Job;

    move-object v3, p0

    check-cast v3, Lkotlinx/coroutines/JobSupport;

    if-ne p2, v3, :cond_6

    instance-of p2, v2, Lkotlinx/coroutines/JobCancellingNode;

    if-nez p2, :cond_6

    goto :goto_3

    :cond_6
    move v0, v1

    :goto_3
    if-eqz v0, :cond_7

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 465
    :cond_8
    new-instance p2, Lkotlinx/coroutines/InvokeOnCompletion;

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/Job;

    invoke-direct {p2, v0, p1}, Lkotlinx/coroutines/InvokeOnCompletion;-><init>(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function1;)V

    move-object v2, p2

    check-cast v2, Lkotlinx/coroutines/JobNode;

    :goto_4
    return-object v2
.end method

.method private final nextChild(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/LockFreeLinkedListNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 829
    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->isRemoved()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getPrevNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object p1

    goto :goto_0

    .line 831
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object p1

    .line 832
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->isRemoved()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 833
    :cond_1
    instance-of v0, p1, Lkotlinx/coroutines/ChildHandleNode;

    if-eqz v0, :cond_2

    check-cast p1, Lkotlinx/coroutines/ChildHandleNode;

    return-object p1

    .line 834
    :cond_2
    instance-of v0, p1, Lkotlinx/coroutines/NodeList;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final notifyCancelling(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V
    .locals 7

    .line 304
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/JobSupport;->onCancellation(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    .line 1326
    check-cast v0, Ljava/lang/Throwable;

    .line 1328
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNext()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 1329
    :goto_0
    move-object v2, p1

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    .line 1330
    instance-of v2, v1, Lkotlinx/coroutines/JobCancellingNode;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/JobNode;

    .line 1332
    :try_start_0
    invoke-virtual {v2, p2}, Lkotlinx/coroutines/JobNode;->invoke(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    if-eqz v0, :cond_0

    .line 1335
    invoke-static {v0, v3}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1334
    :cond_0
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/JobSupport;

    .line 1336
    new-instance v4, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v4, Ljava/lang/Throwable;

    .line 1337
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v0, v4

    .line 1340
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v1

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    .line 1343
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/JobSupport;->handleOnCompletionException$kotlinx_coroutines_core(Ljava/lang/Throwable;)V

    .line 307
    :cond_3
    invoke-direct {p0, p2}, Lkotlinx/coroutines/JobSupport;->cancelParent(Ljava/lang/Throwable;)Z

    return-void

    .line 1328
    :cond_4
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final notifyCompletion(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V
    .locals 7
    .param p1    # Lkotlinx/coroutines/NodeList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1345
    check-cast v0, Ljava/lang/Throwable;

    .line 1347
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNext()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 1348
    :goto_0
    move-object v2, p1

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    .line 1349
    instance-of v2, v1, Lkotlinx/coroutines/JobNode;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/JobNode;

    .line 1351
    :try_start_0
    invoke-virtual {v2, p2}, Lkotlinx/coroutines/JobNode;->invoke(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    if-eqz v0, :cond_0

    .line 1354
    invoke-static {v0, v3}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_0

    goto :goto_1

    .line 1353
    :cond_0
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/JobSupport;

    .line 1355
    new-instance v4, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v4, Ljava/lang/Throwable;

    .line 1356
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v0, v4

    .line 1359
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v1

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    .line 1362
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/JobSupport;->handleOnCompletionException$kotlinx_coroutines_core(Ljava/lang/Throwable;)V

    :cond_3
    return-void

    .line 1347
    :cond_4
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final notifyHandlers(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lkotlinx/coroutines/JobNode<",
            "*>;>(",
            "Lkotlinx/coroutines/NodeList;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 314
    check-cast v0, Ljava/lang/Throwable;

    .line 1364
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;->getNext()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    .line 1365
    :goto_0
    move-object v2, p1

    check-cast v2, Lkotlinx/coroutines/internal/LockFreeLinkedListHead;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    const/4 v2, 0x3

    const-string v3, "T"

    .line 1366
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v2, v1, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Lkotlinx/coroutines/JobNode;

    .line 317
    :try_start_0
    invoke-virtual {v2, p2}, Lkotlinx/coroutines/JobNode;->invoke(Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    if-eqz v0, :cond_0

    .line 1367
    invoke-static {v0, v3}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_0

    goto :goto_1

    .line 319
    :cond_0
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/JobSupport;

    .line 320
    new-instance v4, Lkotlinx/coroutines/CompletionHandlerException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Lkotlinx/coroutines/CompletionHandlerException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v4, Ljava/lang/Throwable;

    .line 321
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v0, v4

    .line 1368
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v1

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    .line 324
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/JobSupport;->handleOnCompletionException$kotlinx_coroutines_core(Ljava/lang/Throwable;)V

    :cond_3
    return-void

    .line 1364
    :cond_4
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final promoteEmptyToNodeList(Lkotlinx/coroutines/Empty;)V
    .locals 2

    .line 473
    new-instance v0, Lkotlinx/coroutines/NodeList;

    invoke-direct {v0}, Lkotlinx/coroutines/NodeList;-><init>()V

    .line 474
    invoke-virtual {p1}, Lkotlinx/coroutines/Empty;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/Incomplete;

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlinx/coroutines/InactiveNodeList;

    invoke-direct {v1, v0}, Lkotlinx/coroutines/InactiveNodeList;-><init>(Lkotlinx/coroutines/NodeList;)V

    move-object v0, v1

    check-cast v0, Lkotlinx/coroutines/Incomplete;

    .line 475
    :goto_0
    sget-object v1, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final promoteSingleToNodeList(Lkotlinx/coroutines/JobNode;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/JobNode<",
            "*>;)V"
        }
    .end annotation

    .line 480
    new-instance v0, Lkotlinx/coroutines/NodeList;

    invoke-direct {v0}, Lkotlinx/coroutines/NodeList;-><init>()V

    check-cast v0, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-virtual {p1, v0}, Lkotlinx/coroutines/JobNode;->addOneIfEmpty(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z

    .line 482
    invoke-virtual {p1}, Lkotlinx/coroutines/JobNode;->getNextNode()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    move-result-object v0

    .line 484
    sget-object v1, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final startInternal(Ljava/lang/Object;)I
    .locals 4

    .line 342
    instance-of v0, p1, Lkotlinx/coroutines/Empty;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    .line 343
    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/Empty;

    invoke-virtual {v0}, Lkotlinx/coroutines/Empty;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    .line 344
    :cond_0
    sget-object v0, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlinx/coroutines/JobSupportKt;->access$getEMPTY_ACTIVE$p()Lkotlinx/coroutines/Empty;

    move-result-object v3

    invoke-virtual {v0, p0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    .line 345
    :cond_1
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->onStartInternal$kotlinx_coroutines_core()V

    return v2

    .line 348
    :cond_2
    instance-of v0, p1, Lkotlinx/coroutines/InactiveNodeList;

    if-eqz v0, :cond_4

    .line 349
    sget-object v0, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, Lkotlinx/coroutines/InactiveNodeList;

    invoke-virtual {v3}, Lkotlinx/coroutines/InactiveNodeList;->getList()Lkotlinx/coroutines/NodeList;

    move-result-object v3

    invoke-virtual {v0, p0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    .line 350
    :cond_3
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->onStartInternal$kotlinx_coroutines_core()V

    return v2

    :cond_4
    return v3
.end method

.method private final stateString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 934
    instance-of v0, p1, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v0, :cond_2

    .line 935
    check-cast p1, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-virtual {p1}, Lkotlinx/coroutines/JobSupport$Finishing;->isCancelling()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Cancelling"

    goto :goto_0

    .line 936
    :cond_0
    iget-boolean p1, p1, Lkotlinx/coroutines/JobSupport$Finishing;->isCompleting:Z

    if-eqz p1, :cond_1

    const-string p1, "Completing"

    goto :goto_0

    :cond_1
    const-string p1, "Active"

    goto :goto_0

    .line 939
    :cond_2
    instance-of v0, p1, Lkotlinx/coroutines/Incomplete;

    if-eqz v0, :cond_4

    check-cast p1, Lkotlinx/coroutines/Incomplete;

    invoke-interface {p1}, Lkotlinx/coroutines/Incomplete;->isActive()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Active"

    goto :goto_0

    :cond_3
    const-string p1, "New"

    goto :goto_0

    .line 940
    :cond_4
    instance-of p1, p1, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz p1, :cond_5

    const-string p1, "Cancelled"

    goto :goto_0

    :cond_5
    const-string p1, "Completed"

    :goto_0
    return-object p1
.end method

.method private final suppressExceptions(Ljava/lang/Throwable;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)Z"
        }
    .end annotation

    .line 241
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_0

    return v1

    .line 242
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Lkotlinx/coroutines/internal/ConcurrentKt;->identitySet(I)Ljava/util/Set;

    move-result-object v0

    .line 244
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Throwable;

    if-eq v3, p1, :cond_1

    .line 245
    instance-of v4, v3, Ljava/util/concurrent/CancellationException;

    if-nez v4, :cond_1

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1325
    invoke-static {p1, v3}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move v1, v2

    goto :goto_0

    :cond_2
    return v1
.end method

.method private final toCancellationException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 375
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    check-cast v0, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    move-object v1, p0

    check-cast v1, Lkotlinx/coroutines/Job;

    invoke-direct {v0, p2, p1, v1}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V

    check-cast v0, Ljava/util/concurrent/CancellationException;

    :goto_1
    return-object v0
.end method

.method private final tryFinalizeFinishingState(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;I)Z
    .locals 5

    .line 195
    instance-of v0, p2, Lkotlinx/coroutines/Incomplete;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_d

    .line 196
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_c

    .line 197
    invoke-virtual {p1}, Lkotlinx/coroutines/JobSupport$Finishing;->isSealed()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_b

    .line 198
    iget-boolean v0, p1, Lkotlinx/coroutines/JobSupport$Finishing;->isCompleting:Z

    if-eqz v0, :cond_a

    .line 199
    instance-of v0, p2, Lkotlinx/coroutines/CompletedExceptionally;

    const/4 v3, 0x0

    if-nez v0, :cond_2

    move-object v0, v3

    goto :goto_2

    :cond_2
    move-object v0, p2

    :goto_2
    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v0, :cond_3

    iget-object v3, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    .line 1322
    :cond_3
    monitor-enter p1

    .line 203
    :try_start_0
    invoke-virtual {p1, v3}, Lkotlinx/coroutines/JobSupport$Finishing;->sealLocked(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v0

    .line 204
    invoke-direct {p0, p1, v0}, Lkotlinx/coroutines/JobSupport;->getFinalRootCause(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 206
    invoke-direct {p0, v4, v0}, Lkotlinx/coroutines/JobSupport;->suppressExceptions(Ljava/lang/Throwable;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p1, Lkotlinx/coroutines/JobSupport$Finishing;->rootCause:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v0, :cond_5

    :cond_4
    move v1, v2

    .line 207
    :cond_5
    monitor-exit p1

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    if-ne v4, v3, :cond_7

    goto :goto_3

    .line 216
    :cond_7
    new-instance p2, Lkotlinx/coroutines/CompletedExceptionally;

    invoke-direct {p2, v4}, Lkotlinx/coroutines/CompletedExceptionally;-><init>(Ljava/lang/Throwable;)V

    :goto_3
    if-eqz v4, :cond_8

    .line 219
    invoke-direct {p0, v4}, Lkotlinx/coroutines/JobSupport;->cancelParent(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 220
    invoke-virtual {p0, v4}, Lkotlinx/coroutines/JobSupport;->handleJobException(Ljava/lang/Throwable;)V

    .line 223
    :cond_8
    sget-object v0, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 225
    check-cast p1, Lkotlinx/coroutines/Incomplete;

    invoke-direct {p0, p1, p2, p3, v1}, Lkotlinx/coroutines/JobSupport;->completeStateFinalization(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;IZ)V

    return v2

    .line 223
    :cond_9
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected state: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lkotlinx/coroutines/JobSupport;->_state:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", expected: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", update: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    :catchall_0
    move-exception p2

    .line 207
    monitor-exit p1

    throw p2

    .line 198
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 197
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 196
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 195
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method private final tryFinalizeSimpleState(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;I)Z
    .locals 3

    .line 255
    instance-of v0, p1, Lkotlinx/coroutines/Empty;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    instance-of v0, p1, Lkotlinx/coroutines/JobNode;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_5

    .line 256
    instance-of v0, p2, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-eqz v0, :cond_4

    .line 257
    sget-object v0, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    .line 258
    :cond_3
    invoke-direct {p0, p1, p2, p3, v2}, Lkotlinx/coroutines/JobSupport;->completeStateFinalization(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;IZ)V

    return v1

    .line 256
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 255
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method private final tryMakeCancelling(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z
    .locals 5

    .line 696
    instance-of v0, p1, Lkotlinx/coroutines/JobSupport$Finishing;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_4

    .line 697
    invoke-interface {p1}, Lkotlinx/coroutines/Incomplete;->isActive()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 699
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->getOrPromoteCancellingList(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 701
    new-instance v3, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-direct {v3, v0, v2, p2}, Lkotlinx/coroutines/JobSupport$Finishing;-><init>(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V

    .line 702
    sget-object v4, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v4, p0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v2

    .line 704
    :cond_1
    invoke-direct {p0, v0, p2}, Lkotlinx/coroutines/JobSupport;->notifyCancelling(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V

    return v1

    :cond_2
    return v2

    .line 697
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 696
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method private final tryMakeCompleting(Ljava/lang/Object;Ljava/lang/Object;I)I
    .locals 8

    .line 746
    instance-of v0, p1, Lkotlinx/coroutines/Incomplete;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 754
    :cond_0
    instance-of v0, p1, Lkotlinx/coroutines/Empty;

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-nez v0, :cond_1

    instance-of v0, p1, Lkotlinx/coroutines/JobNode;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lkotlinx/coroutines/ChildHandleNode;

    if-nez v0, :cond_3

    instance-of v0, p2, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez v0, :cond_3

    .line 755
    check-cast p1, Lkotlinx/coroutines/Incomplete;

    invoke-direct {p0, p1, p2, p3}, Lkotlinx/coroutines/JobSupport;->tryFinalizeSimpleState(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;I)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v3

    .line 759
    :cond_3
    move-object v0, p1

    check-cast v0, Lkotlinx/coroutines/Incomplete;

    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->getOrPromoteCancellingList(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;

    move-result-object v4

    if-eqz v4, :cond_f

    .line 763
    instance-of v5, p1, Lkotlinx/coroutines/JobSupport$Finishing;

    const/4 v6, 0x0

    if-nez v5, :cond_4

    move-object v5, v6

    goto :goto_0

    :cond_4
    move-object v5, p1

    :goto_0
    check-cast v5, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v5, :cond_5

    goto :goto_1

    :cond_5
    new-instance v5, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-direct {v5, v4, v1, v6}, Lkotlinx/coroutines/JobSupport$Finishing;-><init>(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V

    .line 765
    :goto_1
    move-object v7, v6

    check-cast v7, Ljava/lang/Throwable;

    .line 1413
    monitor-enter v5

    .line 768
    :try_start_0
    iget-boolean v7, v5, Lkotlinx/coroutines/JobSupport$Finishing;->isCompleting:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_6

    monitor-exit v5

    return v1

    .line 770
    :cond_6
    :try_start_1
    iput-boolean v3, v5, Lkotlinx/coroutines/JobSupport$Finishing;->isCompleting:Z

    if-eq v5, p1, :cond_7

    .line 775
    sget-object v1, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0, p1, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_7

    monitor-exit v5

    return v2

    .line 778
    :cond_7
    :try_start_2
    invoke-virtual {v5}, Lkotlinx/coroutines/JobSupport$Finishing;->isSealed()Z

    move-result p1

    xor-int/2addr p1, v3

    if-eqz p1, :cond_e

    .line 780
    invoke-virtual {v5}, Lkotlinx/coroutines/JobSupport$Finishing;->isCancelling()Z

    move-result p1

    .line 781
    instance-of v1, p2, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez v1, :cond_8

    move-object v1, v6

    goto :goto_2

    :cond_8
    move-object v1, p2

    :goto_2
    check-cast v1, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_9

    iget-object v1, v1, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    invoke-virtual {v5, v1}, Lkotlinx/coroutines/JobSupport$Finishing;->addExceptionLocked(Ljava/lang/Throwable;)V

    .line 783
    :cond_9
    iget-object v1, v5, Lkotlinx/coroutines/JobSupport$Finishing;->rootCause:Ljava/lang/Throwable;

    xor-int/2addr p1, v3

    if-eqz p1, :cond_a

    goto :goto_3

    :cond_a
    move-object v1, v6

    .line 784
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v5

    if-eqz v1, :cond_b

    .line 786
    invoke-direct {p0, v4, v1}, Lkotlinx/coroutines/JobSupport;->notifyCancelling(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V

    .line 788
    :cond_b
    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->firstChild(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 789
    invoke-direct {p0, v5, p1, p2}, Lkotlinx/coroutines/JobSupport;->tryWaitForChild(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    const/4 p1, 0x2

    return p1

    .line 792
    :cond_c
    invoke-direct {p0, v5, p2, p3}, Lkotlinx/coroutines/JobSupport;->tryFinalizeFinishingState(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;I)Z

    move-result p1

    if-eqz p1, :cond_d

    return v3

    :cond_d
    return v2

    :cond_e
    :try_start_3
    const-string p1, "Failed requirement."

    .line 778
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 784
    monitor-exit v5

    throw p1

    :cond_f
    return v2
.end method

.method private final tryWaitForChild(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z
    .locals 6

    .line 807
    :goto_0
    iget-object v0, p2, Lkotlinx/coroutines/ChildHandleNode;->childJob:Lkotlinx/coroutines/ChildJob;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 809
    new-instance v3, Lkotlinx/coroutines/JobSupport$ChildCompletion;

    invoke-direct {v3, p0, p1, p2, p3}, Lkotlinx/coroutines/JobSupport$ChildCompletion;-><init>(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V

    check-cast v3, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 1414
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 807
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/Job$DefaultImpls;->invokeOnCompletion$default(Lkotlinx/coroutines/Job;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object v0

    .line 811
    sget-object v1, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    if-eq v0, v1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 812
    :cond_0
    check-cast p2, Lkotlinx/coroutines/internal/LockFreeLinkedListNode;

    invoke-direct {p0, p2}, Lkotlinx/coroutines/JobSupport;->nextChild(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final attachChild(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;
    .locals 7
    .param p1    # Lkotlinx/coroutines/ChildJob;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 859
    new-instance v0, Lkotlinx/coroutines/ChildHandleNode;

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/ChildHandleNode;-><init>(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/ChildJob;)V

    check-cast v0, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 1415
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p0

    .line 859
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/Job$DefaultImpls;->invokeOnCompletion$default(Lkotlinx/coroutines/Job;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lkotlinx/coroutines/ChildHandle;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final awaitInternal$kotlinx_coroutines_core(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1077
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 1078
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_2

    .line 1080
    instance-of p1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object p1, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    throw p1

    .line 1084
    :cond_2
    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->startInternal(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 1086
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/JobSupport;->awaitSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final synthetic awaitSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1095
    new-instance v0, Lkotlinx/coroutines/JobSupport$AwaitContinuation;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lkotlinx/coroutines/JobSupport$AwaitContinuation;-><init>(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V

    .line 1096
    invoke-virtual {v0}, Lkotlinx/coroutines/JobSupport$AwaitContinuation;->initCancellability()V

    .line 1097
    new-instance v1, Lkotlinx/coroutines/ResumeAwaitOnCompletion;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/AbstractContinuation;

    invoke-direct {v1, p0, v2}, Lkotlinx/coroutines/ResumeAwaitOnCompletion;-><init>(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/AbstractContinuation;)V

    check-cast v1, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 1416
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1097
    invoke-virtual {p0, v1}, Lkotlinx/coroutines/JobSupport;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    .line 1098
    invoke-virtual {v0}, Lkotlinx/coroutines/JobSupport$AwaitContinuation;->getResult()Ljava/lang/Object;

    move-result-object v0

    .line 1089
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object v0
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x0

    .line 563
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/JobSupport;->cancel(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public synthetic cancel()Z
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Left here for binary compatibility"
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "cancel"
    .end annotation

    .line 26
    invoke-static {p0}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel(Lkotlinx/coroutines/Job;)Z

    move-result v0

    return v0
.end method

.method public cancel(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 568
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->cancelImpl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getHandlesException()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public childCancelled(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 577
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->cancelImpl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getHandlesException()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 1
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/Job$DefaultImpls;->fold(Lkotlinx/coroutines/Job;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext$Key;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            ">(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {p0, p1}, Lkotlinx/coroutines/Job$DefaultImpls;->get(Lkotlinx/coroutines/Job;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 364
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 366
    instance-of v1, v0, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v1, :cond_1

    check-cast v0, Lkotlinx/coroutines/JobSupport$Finishing;

    iget-object v0, v0, Lkotlinx/coroutines/JobSupport$Finishing;->rootCause:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    const-string v1, "Job is cancelling"

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/JobSupport;->toCancellationException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 367
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Job is still new or active: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 368
    :cond_1
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_3

    .line 369
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_2

    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object v0, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    const-string v1, "Job was cancelled"

    invoke-direct {p0, v0, v1}, Lkotlinx/coroutines/JobSupport;->toCancellationException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    .line 370
    :cond_2
    new-instance v0, Lkotlinx/coroutines/JobCancellationException;

    const-string v1, "Job has completed normally"

    const/4 v2, 0x0

    move-object v3, p0

    check-cast v3, Lkotlinx/coroutines/Job;

    invoke-direct {v0, v1, v2, v3}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V

    check-cast v0, Ljava/util/concurrent/CancellationException;

    :goto_0
    return-object v0

    .line 368
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Job is still new or active: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
.end method

.method protected getCancelsParent()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getChildJobCancellationCause()Ljava/lang/Throwable;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 612
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 614
    instance-of v1, v0, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/JobSupport$Finishing;

    iget-object v1, v1, Lkotlinx/coroutines/JobSupport$Finishing;->rootCause:Ljava/lang/Throwable;

    goto :goto_0

    .line 615
    :cond_0
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_4

    .line 616
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object v1, v1, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 624
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getHandlesException()Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_3

    .line 625
    :cond_2
    new-instance v2, Lkotlinx/coroutines/JobCancellationException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Parent job is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->stateString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v3, p0

    check-cast v3, Lkotlinx/coroutines/Job;

    invoke-direct {v2, v0, v1, v3}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V

    move-object v1, v2

    check-cast v1, Ljava/lang/Throwable;

    :cond_3
    return-object v1

    .line 615
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
.end method

.method public final getChildren()Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 838
    new-instance v0, Lkotlinx/coroutines/JobSupport$children$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlinx/coroutines/JobSupport$children$1;-><init>(Lkotlinx/coroutines/JobSupport;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequence(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

.method public final getCompletedInternal$kotlinx_coroutines_core()Ljava/lang/Object;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1065
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 1066
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 1067
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object v0, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    throw v0

    .line 1066
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method protected final getCompletionCause()Ljava/lang/Throwable;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1374
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 387
    instance-of v1, v0, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v1, :cond_1

    check-cast v0, Lkotlinx/coroutines/JobSupport$Finishing;

    iget-object v0, v0, Lkotlinx/coroutines/JobSupport$Finishing;->rootCause:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 388
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Job is still new or active: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 389
    :cond_1
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_3

    .line 390
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_2

    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object v0, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 389
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Job is still new or active: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1
.end method

.method public final getCompletionExceptionOrNull()Ljava/lang/Throwable;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1056
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 1057
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 1058
    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->getExceptionOrNull(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    return-object v0

    .line 1057
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This job has not completed yet"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method protected getHandlesException()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getKey()Lkotlin/coroutines/CoroutineContext$Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    sget-object v0, Lkotlinx/coroutines/Job;->Key:Lkotlinx/coroutines/Job$Key;

    check-cast v0, Lkotlin/coroutines/CoroutineContext$Key;

    return-object v0
.end method

.method public getOnCancelComplete$kotlinx_coroutines_core()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getOnJoin()Lkotlinx/coroutines/selects/SelectClause0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 508
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/selects/SelectClause0;

    return-object v0
.end method

.method public final getState$kotlinx_coroutines_core()Ljava/lang/Object;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1321
    :goto_0
    iget-object v0, p0, Lkotlinx/coroutines/JobSupport;->_state:Ljava/lang/Object;

    .line 164
    instance-of v1, v0, Lkotlinx/coroutines/internal/OpDescriptor;

    if-nez v1, :cond_0

    return-object v0

    .line 165
    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/OpDescriptor;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/OpDescriptor;->perform(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected handleJobException(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public handleOnCompletionException$kotlinx_coroutines_core(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 868
    throw p1
.end method

.method public final initParentJobInternal$kotlinx_coroutines_core(Lkotlinx/coroutines/Job;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/Job;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 140
    iget-object v0, p0, Lkotlinx/coroutines/JobSupport;->parentHandle:Lkotlinx/coroutines/ChildHandle;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    if-nez p1, :cond_1

    .line 142
    sget-object p1, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast p1, Lkotlinx/coroutines/ChildHandle;

    iput-object p1, p0, Lkotlinx/coroutines/JobSupport;->parentHandle:Lkotlinx/coroutines/ChildHandle;

    return-void

    .line 145
    :cond_1
    invoke-interface {p1}, Lkotlinx/coroutines/Job;->start()Z

    .line 147
    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/ChildJob;

    invoke-interface {p1, v0}, Lkotlinx/coroutines/Job;->attachChild(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;

    move-result-object p1

    .line 148
    iput-object p1, p0, Lkotlinx/coroutines/JobSupport;->parentHandle:Lkotlinx/coroutines/ChildHandle;

    .line 150
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->isCompleted()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    invoke-interface {p1}, Lkotlinx/coroutines/ChildHandle;->dispose()V

    .line 152
    sget-object p1, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast p1, Lkotlinx/coroutines/ChildHandle;

    iput-object p1, p0, Lkotlinx/coroutines/JobSupport;->parentHandle:Lkotlinx/coroutines/ChildHandle;

    :cond_2
    return-void

    .line 140
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlinx/coroutines/DisposableHandle;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 397
    invoke-virtual {p0, v0, v1, p1}, Lkotlinx/coroutines/JobSupport;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p1

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;
    .locals 7
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlinx/coroutines/DisposableHandle;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 404
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/JobNode;

    .line 1376
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v2

    .line 407
    instance-of v3, v2, Lkotlinx/coroutines/Empty;

    if-eqz v3, :cond_3

    .line 408
    move-object v3, v2

    check-cast v3, Lkotlinx/coroutines/Empty;

    invoke-virtual {v3}, Lkotlinx/coroutines/Empty;->isActive()Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    .line 410
    :cond_1
    invoke-direct {p0, p3, p1}, Lkotlinx/coroutines/JobSupport;->makeNode(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;

    move-result-object v1

    .line 411
    :goto_1
    sget-object v3, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, Lkotlinx/coroutines/DisposableHandle;

    return-object v1

    .line 413
    :cond_2
    invoke-direct {p0, v3}, Lkotlinx/coroutines/JobSupport;->promoteEmptyToNodeList(Lkotlinx/coroutines/Empty;)V

    goto :goto_0

    .line 415
    :cond_3
    instance-of v3, v2, Lkotlinx/coroutines/Incomplete;

    if-eqz v3, :cond_f

    .line 416
    move-object v3, v2

    check-cast v3, Lkotlinx/coroutines/Incomplete;

    invoke-interface {v3}, Lkotlinx/coroutines/Incomplete;->getList()Lkotlinx/coroutines/NodeList;

    move-result-object v3

    if-nez v3, :cond_5

    if-eqz v2, :cond_4

    .line 418
    check-cast v2, Lkotlinx/coroutines/JobNode;

    invoke-direct {p0, v2}, Lkotlinx/coroutines/JobSupport;->promoteSingleToNodeList(Lkotlinx/coroutines/JobNode;)V

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 420
    :cond_5
    move-object v4, v0

    check-cast v4, Ljava/lang/Throwable;

    .line 421
    sget-object v5, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast v5, Lkotlinx/coroutines/DisposableHandle;

    if-eqz p1, :cond_b

    .line 422
    instance-of v6, v2, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v6, :cond_b

    .line 1377
    monitor-enter v2

    .line 425
    :try_start_0
    move-object v4, v2

    check-cast v4, Lkotlinx/coroutines/JobSupport$Finishing;

    iget-object v4, v4, Lkotlinx/coroutines/JobSupport$Finishing;->rootCause:Ljava/lang/Throwable;

    if-eqz v4, :cond_6

    .line 1378
    instance-of v6, p3, Lkotlinx/coroutines/ChildHandleNode;

    if-eqz v6, :cond_a

    move-object v6, v2

    check-cast v6, Lkotlinx/coroutines/JobSupport$Finishing;

    iget-boolean v6, v6, Lkotlinx/coroutines/JobSupport$Finishing;->isCompleting:Z

    if-nez v6, :cond_a

    :cond_6
    if-eqz v1, :cond_7

    goto :goto_2

    .line 430
    :cond_7
    invoke-direct {p0, p3, p1}, Lkotlinx/coroutines/JobSupport;->makeNode(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;

    move-result-object v1

    .line 431
    :goto_2
    invoke-direct {p0, v2, v3, v1}, Lkotlinx/coroutines/JobSupport;->addLastAtomic(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_8

    monitor-exit v2

    goto :goto_0

    :cond_8
    if-nez v4, :cond_9

    .line 433
    :try_start_1
    check-cast v1, Lkotlinx/coroutines/DisposableHandle;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-object v1

    .line 435
    :cond_9
    :try_start_2
    move-object v5, v1

    check-cast v5, Lkotlinx/coroutines/DisposableHandle;

    .line 437
    :cond_a
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v2

    goto :goto_3

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_b
    :goto_3
    if-eqz v4, :cond_d

    if-eqz p2, :cond_c

    .line 1379
    invoke-interface {p3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    return-object v5

    :cond_d
    if-eqz v1, :cond_e

    goto :goto_4

    .line 444
    :cond_e
    invoke-direct {p0, p3, p1}, Lkotlinx/coroutines/JobSupport;->makeNode(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;

    move-result-object v1

    .line 445
    :goto_4
    invoke-direct {p0, v2, v3, v1}, Lkotlinx/coroutines/JobSupport;->addLastAtomic(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, Lkotlinx/coroutines/DisposableHandle;

    return-object v1

    :cond_f
    if-eqz p2, :cond_12

    .line 452
    instance-of p1, v2, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez p1, :cond_10

    move-object v2, v0

    :cond_10
    check-cast v2, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v2, :cond_11

    iget-object v0, v2, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    .line 1380
    :cond_11
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    :cond_12
    sget-object p1, Lkotlinx/coroutines/NonDisposableHandle;->INSTANCE:Lkotlinx/coroutines/NonDisposableHandle;

    check-cast p1, Lkotlinx/coroutines/DisposableHandle;

    return-object p1
.end method

.method public isActive()Z
    .locals 2

    .line 179
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 180
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/Incomplete;

    invoke-interface {v0}, Lkotlinx/coroutines/Incomplete;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isCancelled()Z
    .locals 2

    .line 186
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 187
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-nez v1, :cond_1

    instance-of v1, v0, Lkotlinx/coroutines/JobSupport$Finishing;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/JobSupport$Finishing;

    invoke-virtual {v0}, Lkotlinx/coroutines/JobSupport$Finishing;->isCancelling()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    .line 183
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isCompletedExceptionally()Z
    .locals 1

    .line 1053
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lkotlinx/coroutines/CompletedExceptionally;

    return v0
.end method

.method public final join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 488
    invoke-direct {p0}, Lkotlinx/coroutines/JobSupport;->joinInternal()Z

    move-result v0

    if-nez v0, :cond_0

    .line 489
    invoke-interface {p1}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/YieldKt;->checkCompletion(Lkotlin/coroutines/CoroutineContext;)V

    .line 490
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 492
    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/JobSupport;->joinSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final synthetic joinSuspend(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1393
    new-instance v0, Lkotlinx/coroutines/CancellableContinuationImpl;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/CancellableContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 1394
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->initCancellability()V

    .line 1395
    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CancellableContinuation;

    .line 504
    new-instance v2, Lkotlinx/coroutines/ResumeOnCompletion;

    move-object v3, p0

    check-cast v3, Lkotlinx/coroutines/Job;

    move-object v4, v1

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-direct {v2, v3, v4}, Lkotlinx/coroutines/ResumeOnCompletion;-><init>(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 1396
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 504
    invoke-virtual {p0, v2}, Lkotlinx/coroutines/JobSupport;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlinx/coroutines/CancellableContinuationKt;->disposeOnCancellation(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/DisposableHandle;)V

    .line 1397
    invoke-virtual {v0}, Lkotlinx/coroutines/CancellableContinuationImpl;->getResult()Ljava/lang/Object;

    move-result-object v0

    .line 1392
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object v0
.end method

.method public final makeCompleting$kotlinx_coroutines_core(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1410
    :pswitch_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    .line 715
    invoke-direct {p0, v0, p1, v1}, Lkotlinx/coroutines/JobSupport;->tryMakeCompleting(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 719
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unexpected result"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    const/4 p1, 0x1

    return p1

    :pswitch_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final makeCompletingOnce$kotlinx_coroutines_core(Ljava/lang/Object;I)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1412
    :pswitch_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 735
    invoke-direct {p0, v0, p1, p2}, Lkotlinx/coroutines/JobSupport;->tryMakeCompleting(Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 741
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected result"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_2
    const/4 p1, 0x1

    return p1

    .line 736
    :pswitch_3
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Job "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is already complete or completing, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "but is being completed with "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 737
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->getExceptionOrNull(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    .line 736
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public minusKey(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext$Key;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;)",
            "Lkotlin/coroutines/CoroutineContext;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {p0, p1}, Lkotlinx/coroutines/Job$DefaultImpls;->minusKey(Lkotlinx/coroutines/Job;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public nameString$kotlinx_coroutines_core()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 931
    invoke-static {p0}, Lkotlinx/coroutines/DebugKt;->getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected onCancellation(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onCompletionInternal$kotlinx_coroutines_core(Ljava/lang/Object;IZ)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onStartInternal$kotlinx_coroutines_core()V
    .locals 0

    return-void
.end method

.method public final parentCancelled(Lkotlinx/coroutines/ParentJob;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/ParentJob;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "parentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 572
    invoke-direct {p0, p1}, Lkotlinx/coroutines/JobSupport;->cancelImpl(Ljava/lang/Object;)Z

    return-void
.end method

.method public plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {p0, p1}, Lkotlinx/coroutines/Job$DefaultImpls;->plus(Lkotlinx/coroutines/Job;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;
    .locals 1
    .param p1    # Lkotlinx/coroutines/Job;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
        message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`."
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {p0, p1}, Lkotlinx/coroutines/Job$DefaultImpls;->plus(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final registerSelectClause0(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/selects/SelectInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/SelectInstance<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "select"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1400
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 514
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 515
    :cond_1
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_3

    const/4 v0, 0x0

    .line 517
    invoke-interface {p1, v0}, Lkotlinx/coroutines/selects/SelectInstance;->trySelect(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 518
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->getCompletion()Lkotlin/coroutines/Continuation;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/YieldKt;->checkCompletion(Lkotlin/coroutines/CoroutineContext;)V

    .line 519
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->getCompletion()Lkotlin/coroutines/Continuation;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlinx/coroutines/intrinsics/UndispatchedKt;->startCoroutineUnintercepted(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    :cond_2
    return-void

    .line 523
    :cond_3
    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->startInternal(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    .line 525
    new-instance v0, Lkotlinx/coroutines/SelectJoinOnCompletion;

    invoke-direct {v0, p0, p1, p2}, Lkotlinx/coroutines/SelectJoinOnCompletion;-><init>(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 1401
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 525
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/JobSupport;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlinx/coroutines/selects/SelectInstance;->disposeOnSelect(Lkotlinx/coroutines/DisposableHandle;)V

    return-void
.end method

.method public final registerSelectClause1Internal$kotlinx_coroutines_core(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/selects/SelectInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/SelectInstance<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "select"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1418
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 1109
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 1110
    :cond_1
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-nez v1, :cond_4

    const/4 v1, 0x0

    .line 1112
    invoke-interface {p1, v1}, Lkotlinx/coroutines/selects/SelectInstance;->trySelect(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1113
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_2

    .line 1114
    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object p2, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    invoke-interface {p1, p2}, Lkotlinx/coroutines/selects/SelectInstance;->resumeSelectCancellableWithException(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1116
    :cond_2
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->getCompletion()Lkotlin/coroutines/Continuation;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lkotlinx/coroutines/intrinsics/UndispatchedKt;->startCoroutineUnintercepted(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    :cond_3
    :goto_0
    return-void

    .line 1120
    :cond_4
    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->startInternal(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1122
    new-instance v0, Lkotlinx/coroutines/SelectAwaitOnCompletion;

    invoke-direct {v0, p0, p1, p2}, Lkotlinx/coroutines/SelectAwaitOnCompletion;-><init>(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V

    check-cast v0, Lkotlinx/coroutines/CompletionHandlerBase;

    .line 1419
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1122
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/JobSupport;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlinx/coroutines/selects/SelectInstance;->disposeOnSelect(Lkotlinx/coroutines/DisposableHandle;)V

    return-void
.end method

.method public final removeNode$kotlinx_coroutines_core(Lkotlinx/coroutines/JobNode;)V
    .locals 3
    .param p1    # Lkotlinx/coroutines/JobNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/JobNode<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1403
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 538
    instance-of v1, v0, Lkotlinx/coroutines/JobNode;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    .line 541
    :cond_1
    sget-object v1, Lkotlinx/coroutines/JobSupport;->_state$FU:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lkotlinx/coroutines/JobSupportKt;->access$getEMPTY_ACTIVE$p()Lkotlinx/coroutines/Empty;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 543
    :cond_2
    instance-of v1, v0, Lkotlinx/coroutines/Incomplete;

    if-eqz v1, :cond_4

    .line 545
    check-cast v0, Lkotlinx/coroutines/Incomplete;

    invoke-interface {v0}, Lkotlinx/coroutines/Incomplete;->getList()Lkotlinx/coroutines/NodeList;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lkotlinx/coroutines/JobNode;->remove()Z

    :cond_3
    return-void

    :cond_4
    return-void
.end method

.method public final selectAwaitCompletion$kotlinx_coroutines_core(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/selects/SelectInstance;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/SelectInstance<",
            "-TR;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "select"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1133
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 1135
    instance-of v1, v0, Lkotlinx/coroutines/CompletedExceptionally;

    if-eqz v1, :cond_0

    .line 1136
    check-cast v0, Lkotlinx/coroutines/CompletedExceptionally;

    iget-object p2, v0, Lkotlinx/coroutines/CompletedExceptionally;->cause:Ljava/lang/Throwable;

    invoke-interface {p1, p2}, Lkotlinx/coroutines/selects/SelectInstance;->resumeSelectCancellableWithException(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1138
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/selects/SelectInstance;->getCompletion()Lkotlin/coroutines/Continuation;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lkotlinx/coroutines/intrinsics/CancellableKt;->startCoroutineCancellable(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    :goto_0
    return-void
.end method

.method public final start()Z
    .locals 1

    .line 1372
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v0

    .line 329
    invoke-direct {p0, v0}, Lkotlinx/coroutines/JobSupport;->startInternal(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 926
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->nameString$kotlinx_coroutines_core()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->getState$kotlinx_coroutines_core()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lkotlinx/coroutines/JobSupport;->stateString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lkotlinx/coroutines/DebugKt;->getHexAddress(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
