.class Lo/drt$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/drt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/drt;


# direct methods
.method constructor <init>(Lo/drt;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/drt$3;->c:Lo/drt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 6

    .line 117
    new-instance v4, Lo/drn;

    invoke-direct {v4}, Lo/drn;-><init>()V

    .line 118
    invoke-static {p1}, Lo/dsh;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    invoke-virtual {v4, p1}, Lo/drn;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {v4, p1}, Lo/drn;->d(Ljava/lang/String;)V

    .line 123
    :goto_0
    invoke-virtual {v4}, Lo/drn;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 124
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v0, v5}, Lo/drt;->c(Lo/drt;Ljava/lang/Integer;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 125
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Handle Sms second challenge Response reqsn is error."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    return-void

    .line 128
    :cond_1
    const-string v0, "DevAuthChallenge"

    invoke-virtual {v4}, Lo/drn;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 129
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Handle Sms second challenge Response reqname is error."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    return-void

    .line 132
    :cond_2
    invoke-virtual {v4}, Lo/drn;->e()I

    move-result v0

    const/16 v1, 0x3e8

    if-ne v1, v0, :cond_3

    .line 134
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-virtual {v4}, Lo/drn;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/drt;->e(Lo/drt;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handle second response mPhoneNumber = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v2}, Lo/drt;->a(Lo/drt;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v0}, Lo/drt;->a(Lo/drt;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 137
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Handle second response mPhoneNumber is not null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v0}, Lo/drt;->d(Lo/drt;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v1}, Lo/drt;->a(Lo/drt;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "authen_Token"

    invoke-virtual {v4}, Lo/drn;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 142
    :cond_3
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v0}, Lo/drt;->e(Lo/drt;)Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 143
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v0}, Lo/drt;->e(Lo/drt;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v4}, Lo/drn;->e()I

    move-result v1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 144
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v0}, Lo/drt;->e(Lo/drt;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v4}, Lo/drn;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 145
    iget-object v0, p0, Lo/drt$3;->c:Lo/drt;

    invoke-static {v0}, Lo/drt;->e(Lo/drt;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0}, Lo/dsh;->e(Landroid/os/Message;)V

    .line 146
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Handle second response success"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    :cond_4
    return-void
.end method
