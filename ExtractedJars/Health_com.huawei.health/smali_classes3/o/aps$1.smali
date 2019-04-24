.class Lo/aps$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/auz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aps;


# direct methods
.method constructor <init>(Lo/aps;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/aps$1;->a:Lo/aps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 68
    iget-object v0, p0, Lo/aps$1;->a:Lo/aps;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aps;->d(Lo/aps;Z)Z

    .line 69
    return-void
.end method
