.class final Lo/eue$4;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eue;->c(Landroid/content/Context;Lo/eui;Ljava/lang/String;Ljava/lang/String;Lo/eug;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/eug;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lo/eui;


# direct methods
.method constructor <init>(Lo/eui;Landroid/content/Context;Lo/eug;)V
    .locals 0

    .line 544
    iput-object p1, p0, Lo/eue$4;->d:Lo/eui;

    iput-object p2, p0, Lo/eue$4;->c:Landroid/content/Context;

    iput-object p3, p0, Lo/eue$4;->b:Lo/eug;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs d([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 10

    .line 549
    iget-object v0, p0, Lo/eue$4;->d:Lo/eui;

    invoke-virtual {v0}, Lo/eui;->d()Ljava/lang/String;

    move-result-object v6

    .line 550
    iget-object v0, p0, Lo/eue$4;->d:Lo/eui;

    invoke-virtual {v0}, Lo/eui;->i()Ljava/lang/String;

    move-result-object v7

    .line 551
    iget-object v0, p0, Lo/eue$4;->d:Lo/eui;

    invoke-virtual {v0}, Lo/eui;->c()Ljava/lang/String;

    move-result-object v8

    .line 552
    iget-object v0, p0, Lo/eue$4;->d:Lo/eui;

    invoke-virtual {v0}, Lo/eui;->e()I

    move-result v9

    .line 553
    iget-object v0, p0, Lo/eue$4;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/eue$4;->b:Lo/eug;

    move-object v2, v6

    move-object v3, v7

    move-object v4, v8

    move v5, v9

    invoke-static/range {v0 .. v5}, Lo/eue;->e(Landroid/content/Context;Lo/eug;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 544
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/eue$4;->d([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
