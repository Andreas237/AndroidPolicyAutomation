.class Lo/clq$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/clq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final e:Lo/clq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 151
    new-instance v0, Lo/clq;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/clq;-><init>(Lo/clq$4;)V

    sput-object v0, Lo/clq$e;->e:Lo/clq;

    .line 152
    return-void
.end method
