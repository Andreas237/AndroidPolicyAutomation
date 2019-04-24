.class public final Lo/azn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:I

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Lorg/jivesoftware/smack/packet/Stanza;

.field private f:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Lorg/jivesoftware/smack/packet/Stanza;IZ)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/azn;->b:I

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/azn;->a:Z

    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/azn;->f:Z

    .line 49
    iput-object p1, p0, Lo/azn;->c:Ljava/lang/String;

    .line 50
    iput-object p2, p0, Lo/azn;->e:Lorg/jivesoftware/smack/packet/Stanza;

    .line 51
    iput p3, p0, Lo/azn;->d:I

    .line 52
    invoke-direct {p0, p2}, Lo/azn;->d(Lorg/jivesoftware/smack/packet/Stanza;)Z

    move-result v0

    iput-boolean v0, p0, Lo/azn;->a:Z

    .line 53
    iput-boolean p4, p0, Lo/azn;->f:Z

    .line 54
    return-void
.end method

.method private d(Lorg/jivesoftware/smack/packet/Stanza;)Z
    .locals 3

    .line 123
    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/Stanza;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v2

    .line 124
    if-eqz v2, :cond_0

    instance-of v0, v2, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;

    if-eqz v0, :cond_0

    .line 126
    const/4 v0, 0x1

    return v0

    .line 128
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 96
    iget v0, p0, Lo/azn;->b:I

    return v0
.end method

.method b()Lorg/jivesoftware/smack/packet/Stanza;
    .locals 1

    .line 106
    iget-object v0, p0, Lo/azn;->e:Lorg/jivesoftware/smack/packet/Stanza;

    return-object v0
.end method

.method c()Z
    .locals 2

    .line 74
    iget v0, p0, Lo/azn;->b:I

    iget v1, p0, Lo/azn;->d:I

    if-ge v0, v1, :cond_0

    .line 76
    const/4 v0, 0x1

    return v0

    .line 78
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method d()V
    .locals 2

    .line 86
    iget v0, p0, Lo/azn;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/azn;->b:I

    .line 87
    return-void
.end method

.method public e()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lo/azn;->f:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 154
    if-nez p1, :cond_0

    .line 156
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_0
    if-ne p0, p1, :cond_1

    .line 161
    const/4 v0, 0x1

    return v0

    .line 164
    :cond_1
    instance-of v0, p1, Lo/azn;

    if-nez v0, :cond_2

    .line 166
    const/4 v0, 0x0

    return v0

    .line 169
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/azn;

    .line 171
    iget-object v0, p0, Lo/azn;->c:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 173
    const/4 v0, 0x0

    return v0

    .line 176
    :cond_3
    iget-object v0, p0, Lo/azn;->c:Ljava/lang/String;

    iget-object v1, v2, Lo/azn;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method h()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lo/azn;->c:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 182
    iget-object v0, p0, Lo/azn;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 184
    const/4 v0, 0x0

    return v0

    .line 187
    :cond_0
    iget-object v0, p0, Lo/azn;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public k()Z
    .locals 1

    .line 138
    iget-boolean v0, p0, Lo/azn;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 144
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    iget-object v0, p0, Lo/azn;->e:Lorg/jivesoftware/smack/packet/Stanza;

    invoke-static {v0}, Lo/bak;->b(Lorg/jivesoftware/smack/packet/Stanza;)Ljava/lang/String;

    move-result-object v3

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PacketSendTask:{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " sentTimes:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/azn;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",maxRetryTimes:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/azn;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",largePacket:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/azn;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
