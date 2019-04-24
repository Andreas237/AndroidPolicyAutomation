.class Lo/cuq$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cuq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final c:Lo/cuq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Lo/cuq;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cuq;-><init>(Lo/cuq$2;)V

    sput-object v0, Lo/cuq$e;->c:Lo/cuq;

    .line 32
    return-void
.end method
