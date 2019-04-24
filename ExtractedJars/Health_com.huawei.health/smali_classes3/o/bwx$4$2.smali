.class Lo/bwx$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwx$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bwx$4;


# direct methods
.method constructor <init>(Lo/bwx$4;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/bwx$4$2;->c:Lo/bwx$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 138
    iget-object v0, p0, Lo/bwx$4$2;->c:Lo/bwx$4;

    iget-object v0, v0, Lo/bwx$4;->c:Lo/bwx;

    invoke-virtual {v0}, Lo/bwx;->d()V

    .line 139
    return-void
.end method
