.class Lo/drt$4;
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
.field final synthetic b:Lo/drt;


# direct methods
.method constructor <init>(Lo/drt;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/drt$4;->b:Lo/drt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 9

    .line 58
    new-instance v3, Lo/dri;

    invoke-direct {v3}, Lo/dri;-><init>()V

    .line 59
    invoke-static {p1}, Lo/dsh;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {v3, p1}, Lo/dri;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v3, p1}, Lo/dri;->c(Ljava/lang/String;)V

    .line 64
    :goto_0
    invoke-virtual {v3}, Lo/dri;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 65
    iget-object v0, p0, Lo/drt$4;->b:Lo/drt;

    invoke-static {v0, v4}, Lo/drt;->e(Lo/drt;Ljava/lang/Integer;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 66
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Handle Sms First Authen Response reqsn is error."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    return-void

    .line 69
    :cond_1
    const-string v0, "DevAuth"

    invoke-virtual {v3}, Lo/dri;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 70
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Handle Sms First Authen Response reqname is error."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    return-void

    .line 74
    :cond_2
    invoke-virtual {v3}, Lo/dri;->d()I

    move-result v5

    .line 75
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HandleAkASFirstAuthenResponse resultcode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    const/16 v0, 0x3f0

    if-ne v0, v5, :cond_5

    .line 77
    invoke-static {}, Lo/drx;->e()Lo/drx;

    move-result-object v0

    iget-object v1, p0, Lo/drt$4;->b:Lo/drt;

    invoke-static {v1}, Lo/drt;->d(Lo/drt;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/drx;->b(Landroid/content/Context;)V

    .line 78
    invoke-virtual {v3}, Lo/dri;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/drx;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 79
    iget-object v0, p0, Lo/drt$4;->b:Lo/drt;

    invoke-static {v0}, Lo/drt;->e(Lo/drt;)Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 80
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Handle second response mMessage is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    :cond_3
    invoke-virtual {v3}, Lo/dri;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    .line 83
    invoke-static {v7}, Lo/dsh;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 84
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 85
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HandleAKAFirstAuthenResponse--payload="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    invoke-static {}, Lo/drt;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handle Start to secondauthen cookie ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    :cond_4
    iget-object v0, p0, Lo/drt$4;->b:Lo/drt;

    invoke-virtual {v0, v6, v8}, Lo/drt;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    iget-object v0, p0, Lo/drt$4;->b:Lo/drt;

    invoke-static {v0}, Lo/drt;->e(Lo/drt;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0, v5}, Lo/dsh;->d(Landroid/os/Message;I)V

    .line 92
    :goto_1
    return-void
.end method
