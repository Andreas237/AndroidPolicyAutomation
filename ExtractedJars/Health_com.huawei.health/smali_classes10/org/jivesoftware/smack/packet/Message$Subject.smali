.class public final Lorg/jivesoftware/smack/packet/Message$Subject;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/packet/Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Subject"
.end annotation


# instance fields
.field private final language:Ljava/lang/String;

.field private final subject:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 674
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 675
    if-nez p1, :cond_0

    .line 676
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Language cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 678
    :cond_0
    if-nez p2, :cond_1

    .line 679
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Subject cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 681
    :cond_1
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->language:Ljava/lang/String;

    .line 682
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->subject:Ljava/lang/String;

    .line 683
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/Message$3;)V
    .locals 0

    .line 669
    invoke-direct {p0, p1, p2}, Lorg/jivesoftware/smack/packet/Message$Subject;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;
    .locals 1

    .line 669
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->subject:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lorg/jivesoftware/smack/packet/Message$Subject;)Ljava/lang/String;
    .locals 1

    .line 669
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->language:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 715
    if-ne p0, p1, :cond_0

    .line 716
    const/4 v0, 0x1

    return v0

    .line 718
    :cond_0
    if-nez p1, :cond_1

    .line 719
    const/4 v0, 0x0

    return v0

    .line 721
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 722
    const/4 v0, 0x0

    return v0

    .line 724
    :cond_2
    move-object v2, p1

    check-cast v2, Lorg/jivesoftware/smack/packet/Message$Subject;

    .line 726
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->language:Ljava/lang/String;

    iget-object v1, v2, Lorg/jivesoftware/smack/packet/Message$Subject;->language:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->subject:Ljava/lang/String;

    iget-object v1, v2, Lorg/jivesoftware/smack/packet/Message$Subject;->subject:Ljava/lang/String;

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

    .line 691
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getSubject()Ljava/lang/String;
    .locals 1

    .line 700
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->subject:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 706
    const/16 v2, 0x1f

    .line 707
    const/4 v3, 0x1

    .line 708
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->language:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit8 v3, v0, 0x1f

    .line 709
    mul-int/lit8 v0, v3, 0x1f

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Message$Subject;->subject:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v3, v0, v1

    .line 710
    return v3
.end method
