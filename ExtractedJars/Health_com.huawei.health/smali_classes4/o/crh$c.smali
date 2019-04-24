.class Lo/crh$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final a:Lo/crh;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 68
    new-instance v0, Lo/crh;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crh;-><init>(Lo/crh$4;)V

    sput-object v0, Lo/crh$c;->a:Lo/crh;

    .line 69
    return-void
.end method
