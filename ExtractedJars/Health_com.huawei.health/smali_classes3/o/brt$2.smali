.class Lo/brt$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/brt;


# direct methods
.method constructor <init>(Lo/brt;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/brt$2;->a:Lo/brt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 263
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/brt$2$3;

    invoke-direct {v1, p0}, Lo/brt$2$3;-><init>(Lo/brt$2;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    .line 282
    return-void
.end method
