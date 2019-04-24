.class Lo/crl$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final e:Lo/crl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 74
    new-instance v0, Lo/crl;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crl;-><init>(Lo/crl$5;)V

    sput-object v0, Lo/crl$e;->e:Lo/crl;

    .line 75
    return-void
.end method
