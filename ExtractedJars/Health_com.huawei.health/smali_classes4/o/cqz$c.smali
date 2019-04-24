.class Lo/cqz$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final b:Lo/cqz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Lo/cqz;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqz;-><init>(Lo/cqz$5;)V

    sput-object v0, Lo/cqz$c;->b:Lo/cqz;

    .line 32
    return-void
.end method
