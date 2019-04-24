.class Lo/ctg$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final b:Lo/ctg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    new-instance v0, Lo/ctg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ctg;-><init>(Lo/ctg$4;)V

    sput-object v0, Lo/ctg$b;->b:Lo/ctg;

    .line 39
    return-void
.end method
