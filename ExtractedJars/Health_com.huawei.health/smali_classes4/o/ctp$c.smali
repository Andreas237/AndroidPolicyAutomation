.class Lo/ctp$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final c:Lo/ctp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 49
    new-instance v0, Lo/ctp;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ctp;-><init>(Lo/ctp$3;)V

    sput-object v0, Lo/ctp$c;->c:Lo/ctp;

    .line 50
    return-void
.end method
