.class Lo/cpy$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final e:Lo/cpy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Lo/cpy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpy;-><init>(Lo/cpy$3;)V

    sput-object v0, Lo/cpy$d;->e:Lo/cpy;

    .line 46
    return-void
.end method
