.class Lo/ctw$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final d:Lo/ctw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Lo/ctw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ctw;-><init>(Lo/ctw$4;)V

    sput-object v0, Lo/ctw$b;->d:Lo/ctw;

    .line 32
    return-void
.end method
