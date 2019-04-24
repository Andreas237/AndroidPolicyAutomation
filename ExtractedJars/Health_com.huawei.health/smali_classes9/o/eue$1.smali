.class final Lo/eue$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eue;->i(Landroid/content/Context;Lo/eui;Lo/eug;)V
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
.field final synthetic a:Landroid/content/Context;

.field final synthetic c:Lo/eui;

.field final synthetic d:Lo/eug;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/eui;Lo/eug;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lo/eue$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lo/eue$1;->c:Lo/eui;

    iput-object p3, p0, Lo/eue$1;->d:Lo/eug;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs d([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .line 201
    iget-object v0, p0, Lo/eue$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/eue$1;->c:Lo/eui;

    iget-object v2, p0, Lo/eue$1;->d:Lo/eug;

    invoke-static {v0, v1, v2}, Lo/eue;->e(Landroid/content/Context;Lo/eui;Lo/eug;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 196
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/eue$1;->d([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
