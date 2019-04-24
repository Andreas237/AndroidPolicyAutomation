.class Lo/com$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/com;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final d:Lo/com;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 72
    new-instance v0, Lo/com;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/com;-><init>(Lo/com$3;)V

    sput-object v0, Lo/com$b;->d:Lo/com;

    .line 73
    return-void
.end method
