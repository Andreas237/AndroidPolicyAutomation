.class Lo/zp$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/zp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field static a:Lo/zp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 42
    new-instance v0, Lo/zp;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/zp;-><init>(Lo/zp;)V

    sput-object v0, Lo/zp$b;->a:Lo/zp;

    return-void
.end method
