.class Lo/cok$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cok;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final d:Lo/cok;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 105
    new-instance v0, Lo/cok;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cok;-><init>(Lo/cok$4;)V

    sput-object v0, Lo/cok$a;->d:Lo/cok;

    .line 106
    return-void
.end method
