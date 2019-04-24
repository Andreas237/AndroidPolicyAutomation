.class Lo/epf$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epf;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/epf;


# direct methods
.method constructor <init>(Lo/epf;)V
    .locals 0

    .line 904
    iput-object p1, p0, Lo/epf$12;->b:Lo/epf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 907
    iget-object v0, p0, Lo/epf$12;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->c(Lo/epf;)Lo/dwr;

    move-result-object v3

    .line 908
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 909
    return-void

    .line 912
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 913
    const/16 v0, 0xf

    invoke-virtual {v3, v0, v4}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v5

    .line 914
    const/16 v0, 0xe

    invoke-virtual {v3, v0, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v6

    .line 916
    const/4 v7, 0x0

    .line 917
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    if-eqz v6, :cond_2

    .line 918
    const-string v0, "UIHLH_AchievementCardData"

    const-string v1, "Get user level is not null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 919
    new-instance v8, Lo/dze;

    invoke-direct {v8, v5, v6}, Lo/dze;-><init>(Ljava/util/List;Lo/dvf;)V

    .line 920
    .line 921
    invoke-static {v8}, Lo/dyj;->c(Lo/dze;)Lo/dzc;

    move-result-object v9

    .line 922
    if-eqz v9, :cond_1

    .line 923
    invoke-virtual {v9}, Lo/dzc;->a()Lo/dzj;

    move-result-object v7

    .line 924
    :cond_1
    goto :goto_0

    .line 925
    :cond_2
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 926
    const/4 v0, 0x5

    invoke-virtual {v3, v0, v8}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v9

    .line 927
    if-eqz v9, :cond_3

    .line 928
    move-object v10, v9

    check-cast v10, Lo/dvh;

    .line 929
    iget-object v0, p0, Lo/epf$12;->b:Lo/epf;

    invoke-virtual {v10}, Lo/dvh;->a()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/epf;->c(Lo/epf;D)Lo/dzj;

    move-result-object v7

    .line 930
    goto :goto_0

    .line 932
    :cond_3
    iget-object v0, p0, Lo/epf$12;->b:Lo/epf;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lo/epf;->c(Lo/epf;D)Lo/dzj;

    move-result-object v7

    .line 936
    :goto_0
    iget-object v0, p0, Lo/epf$12;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->a(Lo/epf;)Landroid/os/Handler;

    move-result-object v8

    .line 937
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 938
    invoke-virtual {v8}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 939
    const/4 v0, 0x1

    iput v0, v9, Landroid/os/Message;->what:I

    .line 940
    iput-object v7, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 941
    invoke-virtual {v8, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 943
    :cond_4
    return-void
.end method
