.class final Lo/eue$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eue;->c(Landroid/content/Context;Lo/eui;Ljava/lang/String;Lo/eug;)V
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
.field final synthetic c:Lo/eug;

.field final synthetic d:Lo/eui;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/eui;Lo/eug;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lo/eue$2;->e:Landroid/content/Context;

    iput-object p2, p0, Lo/eue$2;->d:Lo/eui;

    iput-object p3, p0, Lo/eue$2;->c:Lo/eug;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs d([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .line 333
    iget-object v0, p0, Lo/eue$2;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/eue$2;->d:Lo/eui;

    iget-object v2, p0, Lo/eue$2;->c:Lo/eug;

    invoke-static {v0, v1, v2}, Lo/eue;->a(Landroid/content/Context;Lo/eui;Lo/eug;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 328
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/eue$2;->d([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
