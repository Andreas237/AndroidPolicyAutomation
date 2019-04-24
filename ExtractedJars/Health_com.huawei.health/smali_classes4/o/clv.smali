.class public Lo/clv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<[Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 744
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    .line 747
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "session_type"

    const/16 v2, 0x4e21

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 748
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodpressure_diastolic"

    const/16 v2, 0x7d7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 749
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodpressure_systolic"

    const/16 v2, 0x7d6

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 750
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "heart_rate"

    const/16 v2, 0x7e2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 751
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "heart_rate"

    const/16 v2, 0x7d2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 752
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight"

    const/16 v2, 0x7d4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 753
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_bodyfat"

    const/16 v2, 0x7d1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 754
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_before_dawn"

    const/16 v2, 0x7df

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 755
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_bf_after"

    const/16 v2, 0x7d9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 756
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_bf_before"

    const/16 v2, 0x7d8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 757
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_dn_after"

    const/16 v2, 0x7dd

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 758
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_dn_before"

    const/16 v2, 0x7dc

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 759
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_lc_before"

    const/16 v2, 0x7da

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 760
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_lc_after"

    const/16 v2, 0x7db

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 761
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "bloodsugar_sl_before"

    const/16 v2, 0x7de

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 762
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_bodyfatvalue"

    const/16 v2, 0x7ef

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 763
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_impedance"

    const/16 v2, 0x7f0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 764
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_bmi"

    const/16 v2, 0x7e6

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 765
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_bmr"

    const/16 v2, 0x7e8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 766
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_water"

    const/16 v2, 0x7e9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 767
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_waterrate"

    const/16 v2, 0x7f1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 768
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_muscles"

    const/16 v2, 0x7e7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 769
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_bone_mineral"

    const/16 v2, 0x7eb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 770
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_fatlevel"

    const/16 v2, 0x7ea

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 771
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_protein"

    const/16 v2, 0x7ec

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 772
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_body_age"

    const/16 v2, 0x7ee

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 773
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_body_score"

    const/16 v2, 0x7ed

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 774
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_heart_rate"

    const/16 v2, 0x803

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 775
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_pressure"

    const/16 v2, 0x804

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 776
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_skeletalmusclelmass"

    const/16 v2, 0x805

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 777
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_gender"

    const/16 v2, 0x806

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 778
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_age"

    const/16 v2, 0x807

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 779
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_height"

    const/16 v2, 0x808

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 780
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_healthyweight"

    const/16 v2, 0x809

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 781
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_healthyfatrate"

    const/16 v2, 0x80a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 782
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    const-string v1, "weight_bodysize"

    const/16 v2, 0x80b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 785
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    sput-object v0, Lo/clv;->c:Landroid/util/SparseArray;

    .line 788
    sget-object v0, Lo/clv;->c:Landroid/util/SparseArray;

    const/16 v1, 0x17

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "weight"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "weight_bodyfat"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "weight_bodyfatvalue"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "weight_impedance"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "weight_bmi"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "weight_muscles"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "weight_bmr"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, "weight_water"

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, "weight_waterrate"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, "weight_fatlevel"

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, "weight_bone_mineral"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    const-string v2, "weight_protein"

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, "weight_body_score"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    const-string v2, "weight_body_age"

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, "weight_heart_rate"

    const/16 v3, 0xe

    aput-object v2, v1, v3

    const-string v2, "weight_pressure"

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const-string v2, "weight_skeletalmusclelmass"

    const/16 v3, 0x10

    aput-object v2, v1, v3

    const-string v2, "weight_gender"

    const/16 v3, 0x11

    aput-object v2, v1, v3

    const-string v2, "weight_age"

    const/16 v3, 0x12

    aput-object v2, v1, v3

    const-string v2, "weight_height"

    const/16 v3, 0x13

    aput-object v2, v1, v3

    const-string v2, "weight_healthyweight"

    const/16 v3, 0x14

    aput-object v2, v1, v3

    const-string v2, "weight_healthyfatrate"

    const/16 v3, 0x15

    aput-object v2, v1, v3

    const-string v2, "weight_bodysize"

    const/16 v3, 0x16

    aput-object v2, v1, v3

    const/16 v2, 0x2716

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 791
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()[Ljava/lang/String;
    .locals 3

    .line 708
    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "stat_core_sleep_dream_duration"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "stat_core_sleep_deep_duration"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "stat_core_sleep_shallow_duration"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "stat_core_sleep_wake_duration"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "stat_core_sleep_duration_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "stat_core_sleep_deep_part_count"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "stat_core_sleep_wake_count"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "stat_core_sleep_noon_duration"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_fall_time"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_wake_up_time"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_score"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_latency"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_go_bed_time"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_valid_data"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_efficiency"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "stat_out_core_sleep_snore_freq"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static b(I)[Ljava/lang/String;
    .locals 1

    .line 802
    sget-object v0, Lo/clv;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 1

    .line 798
    sget-object v0, Lo/clv;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 810
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_unit"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e()[Ljava/lang/String;
    .locals 3

    .line 645
    const/16 v0, 0x13

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sport_walk_step_sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "sport_run_step_sum"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "sport_climb_step_sum"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "sport_walk_distance_sum"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "sport_run_distance_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "sport_cycle_distance_sum"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "sport_climb_distance_sum"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "sport_swim_distance_sum"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "sport_walk_duration_sum"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "sport_run_duration_sum"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "sport_cycle_duration_sum"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "sport_climb_duration_sum"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "sport_swim_duration_sum"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "sport_walk_calorie_sum"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "sport_run_calorie_sum"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "sport_cycle_calorie_sum"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "sport_climb_calorie_sum"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "sport_swim_calorie_sum"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "sport_altitude_offset_sum"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    return-object v0
.end method
