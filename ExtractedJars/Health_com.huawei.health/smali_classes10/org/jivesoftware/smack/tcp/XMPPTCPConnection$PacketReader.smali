.class public Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "PacketReader"
.end annotation


# instance fields
.field private volatile done:Z

.field parser:Lorg/xmlpull/v1/XmlPullParser;

.field final synthetic this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;


# direct methods
.method protected constructor <init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;)Z
    .locals 1

    .line 421
    iget-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->done:Z

    return v0
.end method

.method static synthetic access$200(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;)V
    .locals 0

    .line 421
    invoke-direct {p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parsePackets()V

    return-void
.end method

.method private parsePackets()V
    .locals 13

    .line 456
    :try_start_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SynchronizationPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->checkIfSuccessOrWait()Ljava/lang/Exception;

    .line 457
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v4

    .line 458
    :goto_0
    iget-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->done:Z

    if-nez v0, :cond_7

    .line 459
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_7

    .line 461
    :pswitch_0
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 462
    move-object v6, v5

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "message"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "iq"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "stream"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "error"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "failure"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "success"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x5

    goto :goto_1

    :sswitch_6
    const-string v0, "a"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v7, 0x6

    :cond_0
    :goto_1
    packed-switch v7, :pswitch_data_1

    goto/16 :goto_5

    .line 465
    :pswitch_1
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$400(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 466
    goto/16 :goto_6

    .line 469
    :pswitch_2
    const-string v0, "jabber:client"

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 471
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    iget-object v1, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    const-string v2, ""

    const-string v3, "id"

    invoke-interface {v1, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$502(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Ljava/lang/String;)Ljava/lang/String;

    .line 472
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    const-string v1, ""

    const-string v2, "from"

    invoke-interface {v0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 473
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$600(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnectionConfiguration;->getXMPPServiceDomain()Lo/fsz;

    move-result-object v0

    invoke-interface {v0, v8}, Lo/fsz;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 475
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$700(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SynchronizationPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportSuccess()V

    goto :goto_2

    .line 480
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$800(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SynchronizationPoint;

    move-result-object v0

    new-instance v1, Lorg/jivesoftware/smack/SmackException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stream form wrong host:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/SynchronizationPoint;->reportFailure(Ljava/lang/Exception;)V

    .line 483
    :goto_2
    goto/16 :goto_6

    .line 486
    :pswitch_3
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseStreamError(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/StreamError;

    move-result-object v8

    .line 488
    new-instance v0, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;

    invoke-direct {v0, v8}, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;-><init>(Lorg/jivesoftware/smack/packet/StreamError;)V

    throw v0

    .line 490
    :pswitch_4
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 491
    move-object v10, v9

    const/4 v11, -0x1

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_3

    :sswitch_7
    const-string v0, "urn:ietf:params:xml:ns:xmpp-tls"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v11, 0x0

    goto :goto_3

    :sswitch_8
    const-string v0, "http://jabber.org/protocol/compress"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v11, 0x1

    goto :goto_3

    :sswitch_9
    const-string v0, "urn:ietf:params:xml:ns:xmpp-sasl"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v11, 0x2

    goto :goto_3

    :sswitch_a
    const-string v0, "urn:socialim:params:xml:ns:xmpp-sasl"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v11, 0x3

    :cond_2
    :goto_3
    packed-switch v11, :pswitch_data_2

    goto :goto_4

    .line 494
    :pswitch_5
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    const-string v1, "TLS negotiation has failed"

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 501
    :pswitch_6
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    const-string v1, "Compress unsupport!"

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 506
    :pswitch_7
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseSASLFailure(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;

    move-result-object v12

    .line 507
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$900(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SASLAuthentication;

    move-result-object v0

    invoke-virtual {v0, v12}, Lorg/jivesoftware/smack/SASLAuthentication;->authenticationFailed(Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;)V

    .line 510
    :goto_4
    goto :goto_6

    .line 513
    :pswitch_8
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseSuccess(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;

    move-result-object v10

    .line 514
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1000(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;)Lorg/jivesoftware/smack/SASLAuthentication;

    move-result-object v0

    invoke-virtual {v0, v10}, Lorg/jivesoftware/smack/SASLAuthentication;->authenticated(Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;)V

    .line 515
    goto :goto_6

    .line 517
    :pswitch_9
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-static {v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseAnReport(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/AnReport;

    move-result-object v11

    .line 518
    if-eqz v11, :cond_3

    .line 519
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0, v11}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1100(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Lorg/jivesoftware/smack/packet/Stanza;)V

    goto :goto_6

    .line 523
    :goto_5
    const-string v0, "XMPPTCPConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown top level stream element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    :cond_3
    :goto_6
    goto :goto_7

    .line 528
    :pswitch_a
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "stream"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 529
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http://etherx.jabber.org/streams"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 530
    const-string v0, "XMPPTCPConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " </stream> but different namespace "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    goto :goto_7

    .line 537
    :cond_4
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    iget-object v0, v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->access$1200(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 539
    if-eqz v6, :cond_5

    .line 543
    return-void

    .line 549
    :cond_5
    const-string v0, "XMPPTCPConnection"

    const-string v1, " received closing </stream> element. Server wants to terminate the connection, calling disconnect()"

    :try_start_1
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->disconnect()V

    .line 553
    goto :goto_7

    .line 558
    :pswitch_b
    new-instance v0, Lorg/jivesoftware/smack/SmackException;

    const-string v1, "Parser got END_DOCUMENT event. This could happen e.g. if the server closed the connection without sending a closing stream element"

    invoke-direct {v0, v1}, Lorg/jivesoftware/smack/SmackException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 561
    :cond_6
    :goto_7
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->parser:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v4

    goto/16 :goto_0

    .line 574
    :cond_7
    goto :goto_8

    .line 564
    :catch_0
    move-exception v4

    .line 567
    iget-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->done:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    iget-object v0, v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->packetWriter:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;

    invoke-static {v0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;->access$1200(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketWriter;)Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/ArrayBlockingQueueWithShutdown;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_8

    .line 570
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0, v4}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1300(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Ljava/lang/Exception;)V

    .line 572
    iget-object v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    invoke-static {v0, v4}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->access$1400(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;Ljava/lang/Exception;)V

    .line 575
    :cond_8
    :goto_8
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_0
        :pswitch_a
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x6f4abffd -> :sswitch_5
        -0x40c3ce76 -> :sswitch_4
        -0x352ab080 -> :sswitch_2
        0x61 -> :sswitch_6
        0xd28 -> :sswitch_1
        0x5c4d208 -> :sswitch_3
        0x38eb0007 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_8
        :pswitch_9
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x5d967ac2 -> :sswitch_9
        0x292a0881 -> :sswitch_a
        0x36c99e04 -> :sswitch_7
        0x7e3cfdd6 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method


# virtual methods
.method init()V
    .locals 3

    .line 432
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->done:Z

    .line 434
    new-instance v0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader$4;

    invoke-direct {v0, p0}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader$4;-><init>(Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Smack Packet Reader ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->this$0:Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;

    .line 439
    invoke-virtual {v2}, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection;->getConnectionCounter()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 434
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/util/Async;->go(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;

    .line 440
    return-void
.end method

.method shutdown()V
    .locals 1

    .line 446
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/jivesoftware/smack/tcp/XMPPTCPConnection$PacketReader;->done:Z

    .line 447
    return-void
.end method
