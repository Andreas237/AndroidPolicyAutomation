.class Lo/cun$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cun;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final a:Lo/cun;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 53
    new-instance v0, Lo/cun;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cun;-><init>(Lo/cun$5;)V

    sput-object v0, Lo/cun$d;->a:Lo/cun;

    .line 54
    return-void
.end method
