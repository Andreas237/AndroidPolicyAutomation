.class Lo/chb$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/chb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/chb;


# direct methods
.method private constructor <init>(Lo/chb;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lo/chb$c;->d:Lo/chb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/chb;Lo/chb$1;)V
    .locals 0

    .line 168
    invoke-direct {p0, p1}, Lo/chb$c;-><init>(Lo/chb;)V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    .line 178
    return-void
.end method

.method public onFinish()V
    .locals 2

    .line 172
    iget-object v0, p0, Lo/chb$c;->d:Lo/chb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/chb;->c(Lo/chb;Z)Z

    .line 173
    return-void
.end method
