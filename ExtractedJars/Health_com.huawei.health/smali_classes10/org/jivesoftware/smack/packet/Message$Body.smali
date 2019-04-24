.class public final Lorg/jivesoftware/smack/packet/Message$Body;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Body"
.end annotation


# instance fields
.field private final language:Ljava/lang/String;

.field private final message:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 739
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 740
    if-nez p1, :cond_0

    .line 741
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Language cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 743
    :cond_0
    if-nez p2, :cond_1

    .line 744
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Message cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 746
    :cond_1
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Message$Body;->language:Ljava/lang/String;

    .line 747
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/Message$Body;->message:Ljava/lang/String;

    .line 748
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/Message$3;)V
    .locals 0

    .line 734
    invoke-direct {p0, p1, p2}, Lorg/jivesoftware/smack/packet/Message$Body;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lorg/jivesoftware/smack/packet/Message$Body;)Ljava/lang/String;
    .locals 1

    .line 734
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Body;->message:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lorg/jivesoftware/smack/packet/Message$Body;)Ljava/lang/String;
    .locals 1

    .line 734
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Body;->language:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 779
    if-ne p0, p1, :cond_0

    .line 780
    const/4 v0, 0x1

    return v0

    .line 782
    :cond_0
    if-nez p1, :cond_1

    .line 783
    const/4 v0, 0x0

    return v0

    .line 785
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 786
    const/4 v0, 0x0

    return v0

    .line 788
    :cond_2
    move-object v2, p1

    check-cast v2, Lorg/jivesoftware/smack/packet/Message$Body;

    .line 790
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Body;->language:Ljava/lang/String;

    iget-object v1, v2, Lorg/jivesoftware/smack/packet/Message$Body;->language:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Body;->message:Ljava/lang/String;

    iget-object v1, v2, Lorg/jivesoftware/smack/packet/Message$Body;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 756
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Body;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 765
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Body;->message:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 770
    const/16 v2, 0x1f

    .line 771
    const/4 v3, 0x1

    .line 772
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Body;->language:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit8 v3, v0, 0x1f

    .line 773
    mul-int/lit8 v0, v3, 0x1f

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Message$Body;->message:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v3, v0, v1

    .line 774
    return v3
.end method
