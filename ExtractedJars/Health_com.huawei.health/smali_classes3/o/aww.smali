.class public Lo/aww;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    .line 65
    iput-object p1, p0, Lo/aww;->d:Landroid/os/Handler;

    .line 66
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 133
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/awj;->a(Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 136
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 137
    const/16 v0, 0x140

    iput v0, v1, Landroid/os/Message;->what:I

    .line 138
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 139
    const-string v0, "bundleKeyUserPrivacyFlags"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 141
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 143
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .line 150
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    const/16 v1, 0x141

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 154
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/aww;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/aww;->c(I)V

    return-void
.end method

.method static synthetic b(Lo/aww;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/aww;->a(Ljava/lang/String;)V

    return-void
.end method

.method private c(I)V
    .locals 3

    .line 161
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    const/16 v1, 0x142

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 164
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 165
    iget-object v0, p0, Lo/aww;->d:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 167
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/aww;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/aww;->b()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 1

    .line 75
    new-instance v0, Lo/aww$1;

    invoke-direct {v0, p0, p1}, Lo/aww$1;-><init>(Lo/aww;Ljava/lang/String;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 124
    return-void
.end method
