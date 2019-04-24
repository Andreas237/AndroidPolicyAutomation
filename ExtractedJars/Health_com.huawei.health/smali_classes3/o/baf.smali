.class public Lo/baf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lorg/jivesoftware/smack/packet/Message;>;Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 14
    move-object v0, p1

    check-cast v0, Lorg/jivesoftware/smack/packet/Message;

    move-object v1, p2

    check-cast v1, Lorg/jivesoftware/smack/packet/Message;

    invoke-virtual {p0, v0, v1}, Lo/baf;->d(Lorg/jivesoftware/smack/packet/Message;Lorg/jivesoftware/smack/packet/Message;)I

    move-result v0

    return v0
.end method

.method public d(Lorg/jivesoftware/smack/packet/Message;Lorg/jivesoftware/smack/packet/Message;)I
    .locals 4

    .line 22
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v0

    invoke-virtual {p2}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 24
    const/4 v0, -0x1

    return v0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v0

    invoke-virtual {p2}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 28
    const/4 v0, 0x0

    return v0

    .line 30
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
