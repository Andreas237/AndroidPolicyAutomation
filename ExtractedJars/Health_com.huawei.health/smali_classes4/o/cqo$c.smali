.class Lo/cqo$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final c:Lo/cqo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 34
    new-instance v0, Lo/cqo;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqo;-><init>(Lo/cqo$5;)V

    sput-object v0, Lo/cqo$c;->c:Lo/cqo;

    .line 35
    return-void
.end method
