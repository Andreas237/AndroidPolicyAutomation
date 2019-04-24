.class public Lcom/j256/ormlite/android/compat/JellyBeanApiCompatibility;
.super Lcom/j256/ormlite/android/compat/BasicApiCompatibility;
.source "JellyBeanApiCompatibility.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/j256/ormlite/android/compat/JellyBeanApiCompatibility$JellyBeanCancellationHook;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/j256/ormlite/android/compat/BasicApiCompatibility;-><init>()V

    return-void
.end method


# virtual methods
.method public createCancellationHook()Lcom/j256/ormlite/android/compat/ApiCompatibility$CancellationHook;
    .locals 1

    .line 29
    new-instance v0, Lcom/j256/ormlite/android/compat/JellyBeanApiCompatibility$JellyBeanCancellationHook;

    invoke-direct {v0}, Lcom/j256/ormlite/android/compat/JellyBeanApiCompatibility$JellyBeanCancellationHook;-><init>()V

    return-object v0
.end method

.method public rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Lcom/j256/ormlite/android/compat/ApiCompatibility$CancellationHook;)Landroid/database/Cursor;
    .locals 1

    if-nez p4, :cond_1

    .line 21
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

    .line 23
    :cond_1
    check-cast p4, Lcom/j256/ormlite/android/compat/JellyBeanApiCompatibility$JellyBeanCancellationHook;

    invoke-static {p4}, Lcom/j256/ormlite/android/compat/JellyBeanApiCompatibility$JellyBeanCancellationHook;->access$000(Lcom/j256/ormlite/android/compat/JellyBeanApiCompatibility$JellyBeanCancellationHook;)Landroid/os/CancellationSignal;

    move-result-object p4

    instance-of v0, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_2

    invoke-virtual {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_1

    :cond_2
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1, p2, p3, p4}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :goto_1
    return-object p1
.end method
