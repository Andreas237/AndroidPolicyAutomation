.class public Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "PacketWriter"
.end annotation


# static fields
.field public static final QUEUE_SIZE:I = 0x1f4


# instance fields
.field private volatile instantShutdown:Z

.field private final queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown<Lorg/jivesoftware/smack/packet/Element;>;"
        }
    .end annotation
.end field

.field protected shutdownDone:Lorg/jivesoftware/smack/SynchronizationPoint;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/SynchronizationPoint<Lorg/jivesoftware/smack/SmackException$NoResponseException;>;"
        }
    .end annotation
.end field

.field protected volatile shutdownTimestamp:Ljava/lang/Long;

.field final synthetic this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;


# direct methods
.method protected constructor <init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)V
    .locals 3

    .line 578
    iput-object p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 581
    new-instance v0, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    const/16 v1, 0x1f4

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;-><init>(IZ)V

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    .line 587
    new-instance v0, Lorg/jivesoftware/smack/SynchronizationPoint;

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    const-string v2, "shutdown completed"

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/SynchronizationPoint;-><init>(Lorg/jivesoftware/smack/AbstractXMPPConnection;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownDone:Lorg/jivesoftware/smack/SynchronizationPoint;

    .line 593
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownTimestamp:Ljava/lang/Long;

    return-void
.end method

.method static synthetic access$100(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)Z
    .locals 1

    .line 578
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->done()Z

    move-result v0

    return v0
.end method

.method static synthetic access$1200(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;
    .locals 1

    .line 578
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    return-object v0
.end method

.method static synthetic access$1500(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)V
    .locals 0

    .line 578
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->writePackets()V

    return-void
.end method

.method private done()Z
    .locals 1

    .line 615
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownTimestamp:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private nextStreamElement()Lorg/jivesoftware/smack/packet/Element;
    .locals 4

    .line 673
    const/4 v2, 0x0

    .line 675
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/Element;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 682
    goto :goto_0

    .line 677
    :catch_0
    move-exception v3

    .line 678
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 680
    const-string v0, "XMPPTCPConnection"

    const-string v1, "Packet writer thread was interrupted. Don\'t do that. Use disconnect() instead."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 683
    :cond_0
    :goto_0
    return-object v2
.end method

.method private writePackets()V
    .locals 7

    .line 687
    const/4 v2, 0x0

    .line 689
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->openStream()V

    .line 690
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SynchronizationPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportSuccess()V

    .line 692
    :goto_0
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->done()Z

    move-result v0

    if-nez v0, :cond_5

    .line 693
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->nextStreamElement()Lorg/jivesoftware/smack/packet/Element;

    move-result-object v3

    .line 694
    if-nez v3, :cond_0

    .line 695
    goto :goto_0

    .line 698
    :cond_0
    const/4 v4, 0x0

    .line 699
    instance-of v0, v3, Lorg/jivesoftware/smack/packet/Stanza;

    if-eqz v0, :cond_1

    .line 700
    move-object v4, v3

    check-cast v4, Lorg/jivesoftware/smack/packet/Stanza;

    .line 703
    :cond_1
    invoke-interface {v3}, Lorg/jivesoftware/smack/packet/Element;->toXML()Ljava/lang/CharSequence;

    move-result-object v5

    .line 704
    instance-of v0, v5, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    if-eqz v0, :cond_2

    .line 705
    move-object v0, v5

    check-cast v0, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1600(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->write(Ljava/io/Writer;)V

    goto :goto_1

    .line 708
    :cond_2
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1700(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v0

    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 711
    :goto_1
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 712
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1800(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 714
    :cond_3
    if-eqz v4, :cond_4

    .line 715
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0, v4}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1900(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Lorg/jivesoftware/smack/packet/Stanza;)V

    .line 717
    :cond_4
    goto :goto_0

    .line 718
    :cond_5
    iget-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->instantShutdown:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_7

    .line 721
    :goto_2
    :try_start_1
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 722
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->remove()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/packet/Element;

    .line 723
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$2000(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v0

    invoke-interface {v3}, Lorg/jivesoftware/smack/packet/Element;->toXML()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 724
    goto :goto_2

    .line 725
    :cond_6
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$2100(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 729
    goto :goto_3

    .line 727
    :catch_0
    move-exception v3

    .line 728
    const-string v0, "XMPPTCPConnection"

    const-string v1, "Exception flushing queue during shutdown, ignore and continue"

    :try_start_2
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 731
    :goto_3
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->clear()V

    goto :goto_4

    .line 735
    :cond_7
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->clear()V

    .line 738
    :goto_4
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$2200(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_8

    .line 741
    :try_start_3
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$2300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v0

    const-string v1, "</stream:stream>"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 742
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$2400(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 744
    const-wide/16 v0, 0xc8

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 747
    goto :goto_5

    .line 745
    :catch_1
    move-exception v3

    .line 746
    const-string v0, "XMPPTCPConnection"

    const-string v1, "Exception writing closing stream element"

    :try_start_4
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 749
    :cond_8
    :goto_5
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$2500(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 760
    const-string v0, "XMPPTCPConnection"

    const-string v1, "Reporting shutdownDone success in writer thread"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownDone:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportSuccess()V

    .line 762
    goto :goto_7

    .line 751
    :catch_2
    move-exception v3

    .line 754
    :try_start_5
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->done()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_9

    .line 755
    move-object v2, v3

    goto :goto_6

    .line 757
    :cond_9
    const-string v0, "XMPPTCPConnection"

    const-string v1, "Ignoring Exception in writePackets()"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 760
    :goto_6
    const-string v0, "XMPPTCPConnection"

    const-string v1, "Reporting shutdownDone success in writer thread"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownDone:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportSuccess()V

    .line 762
    goto :goto_7

    .line 760
    :catchall_0
    move-exception v6

    const-string v0, "XMPPTCPConnection"

    const-string v1, "Reporting shutdownDone success in writer thread"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownDone:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportSuccess()V

    .line 762
    throw v6

    .line 764
    :goto_7
    if-eqz v2, :cond_a

    .line 765
    const-string v0, "XMPPTCPConnection"

    const-string v1, "write before notify connect error"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 766
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0, v2}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Ljava/lang/Exception;)V

    .line 768
    :cond_a
    return-void
.end method


# virtual methods
.method init()V
    .locals 3

    .line 602
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownDone:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->init()V

    .line 603
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownTimestamp:Ljava/lang/Long;

    .line 605
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->start()V

    .line 606
    new-instance v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter$3;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter$3;-><init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Smack Packet Writer ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    .line 611
    invoke-virtual {v2}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getConnectionCounter()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 606
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/util/Async;->go(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;

    .line 612
    return-void
.end method

.method protected sendStreamElement(Lorg/jivesoftware/smack/packet/Element;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 633
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->throwNotConnectedExceptionIfDoneAndResumptionNotPossible()V

    .line 635
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0, p1}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 645
    goto :goto_0

    .line 637
    :catch_0
    move-exception v1

    .line 642
    invoke-virtual {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->throwNotConnectedExceptionIfDoneAndResumptionNotPossible()V

    .line 644
    throw v1

    .line 646
    :goto_0
    return-void
.end method

.method shutdown(Z)V
    .locals 3

    .line 654
    iput-boolean p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->instantShutdown:Z

    .line 655
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->queue:Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->shutdown()V

    .line 656
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownTimestamp:Ljava/lang/Long;

    .line 658
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->shutdownDone:Lorg/jivesoftware/smack/SynchronizationPoint;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->checkIfSuccessOrWait()Ljava/lang/Exception;
    :try_end_0
    .catch Lorg/jivesoftware/smack/SmackException$NoResponseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 662
    goto :goto_0

    .line 660
    :catch_0
    move-exception v2

    .line 661
    const-string v0, "XMPPTCPConnection"

    const-string v1, "shutdownDone was not marked as successful by the writer thread"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 663
    :goto_0
    return-void
.end method

.method protected throwNotConnectedExceptionIfDoneAndResumptionNotPossible()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jivesoftware/smack/SmackException$NotConnectedException;
        }
    .end annotation

    .line 619
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->done()Z

    move-result v1

    .line 620
    if-eqz v1, :cond_0

    .line 621
    new-instance v0, Lorg/jivesoftware/smack/SmackException$NotConnectedException;

    invoke-direct {v0}, Lorg/jivesoftware/smack/SmackException$NotConnectedException;-><init>()V

    throw v0

    .line 623
    :cond_0
    return-void
.end method
