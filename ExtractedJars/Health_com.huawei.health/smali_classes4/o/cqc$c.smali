.class Lo/cqc$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final e:Lo/cqc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 41
    new-instance v0, Lo/cqc;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqc;-><init>(Lo/cqc$3;)V

    sput-object v0, Lo/cqc$c;->e:Lo/cqc;

    .line 42
    return-void
.end method
