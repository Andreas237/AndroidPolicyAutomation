.class Lo/eta$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eta;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static b:Lo/eta;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 143
    new-instance v0, Lo/eta;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/eta;-><init>(Lo/eta$2;)V

    sput-object v0, Lo/eta$d;->b:Lo/eta;

    return-void
.end method
