.class Lo/cpv$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final e:Lo/cpv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Lo/cpv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpv;-><init>(Lo/cpv$2;)V

    sput-object v0, Lo/cpv$e;->e:Lo/cpv;

    .line 38
    return-void
.end method
