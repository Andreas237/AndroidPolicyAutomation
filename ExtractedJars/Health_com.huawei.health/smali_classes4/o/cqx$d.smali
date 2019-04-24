.class Lo/cqx$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final e:Lo/cqx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Lo/cqx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqx;-><init>(Lo/cqx$4;)V

    sput-object v0, Lo/cqx$d;->e:Lo/cqx;

    .line 32
    return-void
.end method
