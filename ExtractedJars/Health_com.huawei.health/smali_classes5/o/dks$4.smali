.class Lo/dks$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dks;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dks;


# direct methods
.method constructor <init>(Lo/dks;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/dks$4;->c:Lo/dks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 104
    iget-object v0, p0, Lo/dks$4;->c:Lo/dks;

    invoke-static {v0}, Lo/dks;->b(Lo/dks;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    iget-object v1, p0, Lo/dks$4;->c:Lo/dks;

    invoke-static {v1}, Lo/dks;->c(Lo/dks;)Landroid/telephony/PhoneStateListener;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 105
    return-void
.end method
