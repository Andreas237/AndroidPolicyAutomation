.class Lo/cpe$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final c:Lo/cpe;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 57
    new-instance v0, Lo/cpe;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpe;-><init>(Lo/cpe$2;)V

    sput-object v0, Lo/cpe$d;->c:Lo/cpe;

    .line 58
    return-void
.end method
