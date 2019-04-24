.class public Lcom/j256/ormlite/android/compat/BasicApiCompatibility;
.super Ljava/lang/Object;
.source "BasicApiCompatibility.java"

# interfaces
.implements Lcom/j256/ormlite/android/compat/ApiCompatibility;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createCancellationHook()Lcom/j256/ormlite/android/compat/ApiCompatibility$CancellationHook;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Lcom/j256/ormlite/android/compat/ApiCompatibility$CancellationHook;)Landroid/database/Cursor;
    .locals 0

    .line 15
    instance-of p4, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez p4, :cond_0

    invoke-virtual {p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1, p2, p3}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    :goto_0
    return-object p1
.end method
