.class Lo/cpz$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final c:Lo/cpz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 52
    new-instance v0, Lo/cpz;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpz;-><init>(Lo/cpz$3;)V

    sput-object v0, Lo/cpz$b;->c:Lo/cpz;

    .line 53
    return-void
.end method
