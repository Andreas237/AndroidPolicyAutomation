.class Lo/cov$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cov;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final d:Lo/cov;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lo/cov;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cov;-><init>(Lo/cov$2;)V

    sput-object v0, Lo/cov$c;->d:Lo/cov;

    .line 37
    return-void
.end method
