.class Lo/ctx$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final c:Lo/ctx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 54
    new-instance v0, Lo/ctx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ctx;-><init>(Lo/ctx$2;)V

    sput-object v0, Lo/ctx$e;->c:Lo/ctx;

    .line 55
    return-void
.end method
