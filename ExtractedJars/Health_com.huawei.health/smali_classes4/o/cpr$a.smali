.class Lo/cpr$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final d:Lo/cpr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lo/cpr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpr;-><init>(Lo/cpr$1;)V

    sput-object v0, Lo/cpr$a;->d:Lo/cpr;

    .line 37
    return-void
.end method
