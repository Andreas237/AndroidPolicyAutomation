.class Lo/cpk$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final b:Lo/cpk;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 113
    new-instance v0, Lo/cpk;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpk;-><init>(Lo/cpk$4;)V

    sput-object v0, Lo/cpk$c;->b:Lo/cpk;

    .line 114
    return-void
.end method
