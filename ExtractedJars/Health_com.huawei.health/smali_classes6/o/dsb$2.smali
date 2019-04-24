.class Lo/dsb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dsb;


# direct methods
.method constructor <init>(Lo/dsb;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 7

    .line 44
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    invoke-static {}, Lo/dsb;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Start GBA AUTH Second result ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    :cond_0
    new-instance v3, Lo/drn;

    invoke-direct {v3}, Lo/drn;-><init>()V

    .line 48
    invoke-static {p1}, Lo/dsh;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {v3, p1}, Lo/drn;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v3, p1}, Lo/drn;->d(Ljava/lang/String;)V

    .line 53
    :goto_0
    invoke-virtual {v3}, Lo/drn;->e()I

    move-result v4

    .line 54
    invoke-virtual {v3}, Lo/drn;->d()Ljava/lang/String;

    move-result-object v5

    .line 55
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    invoke-static {}, Lo/dsb;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Start GBA AUTH Second resultcode ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    :cond_2
    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    .line 61
    :sswitch_0
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->d(Lo/dsb;)Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 62
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->c(Lo/dsb;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqo;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 63
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 64
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->c(Lo/dsb;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "authen_Token"

    invoke-virtual {v3}, Lo/drn;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v6, v1, v2}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 66
    :cond_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 67
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->c(Lo/dsb;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "authen_Token"

    invoke-virtual {v3}, Lo/drn;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v5, v1, v2}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 69
    :cond_4
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 70
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->c(Lo/dsb;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5, v6}, Lo/dsh;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    :cond_5
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->d(Lo/dsb;)Landroid/os/Message;

    move-result-object v0

    iput v4, v0, Landroid/os/Message;->arg1:I

    .line 73
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->d(Lo/dsb;)Landroid/os/Message;

    move-result-object v0

    iput-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 74
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->d(Lo/dsb;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0}, Lo/dsh;->e(Landroid/os/Message;)V

    .line 75
    goto :goto_2

    .line 78
    :goto_1
    iget-object v0, p0, Lo/dsb$2;->a:Lo/dsb;

    invoke-static {v0}, Lo/dsb;->d(Lo/dsb;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 81
    :cond_6
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method
