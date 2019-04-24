.class Lo/dxd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxd;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dxd;


# direct methods
.method constructor <init>(Lo/dxd;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/dxd$1;->b:Lo/dxd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 59
    iget-object v0, p0, Lo/dxd$1;->b:Lo/dxd;

    invoke-virtual {v0}, Lo/dxd;->d()V

    .line 60
    return-void
.end method
