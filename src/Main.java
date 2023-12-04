public class Main {
    public static void main(String[] args) {
        // Задача №1:
        int Users = 5;
        byte OneUserHours = 2;
        short TwoUserHours = 6;
        long ThreeUserHours = 4L;
        float FourUserHours = 2.5f;
        double FiveUserHours = 3.5;
        System.out.println("Задача № 1:\n" + "\tЗначение переменной с типом int равно: " + Users +
                "\n\tЗначение переменной с типом byte равно: " + OneUserHours +
                "\n\tЗначение переменной с типом short равно: " + TwoUserHours +
                "\n\tЗначение переменной с типом long равно: " + ThreeUserHours +
                "\n\tЗначение переменной с типом float равно: " + FourUserHours +
                "\n\tЗначение переменной с типом double равно: " + FiveUserHours);
        // Задача № 2:
        float OneNumber = 27.12f;
        int TwoNumber = 27897;
        short ThreeNumber = 569;
        double FourNumber = 2.786;
        byte FiveNumber = 67;
        short SixNumber = -159;
        long SevenNumber = 987678965549L;
        System.out.println("\nЗадача № 2: " + "\n\t" + OneNumber + "\n\t" + TwoNumber + "\n\t" +
                ThreeNumber + "\n\t" + FourNumber +
                "\n\t" + FiveNumber + "\n\t" + SixNumber + "\n\t" + SevenNumber);
        // Задача № 3:
        byte OneTeacher = 23, TwoTeacher = 27, ThreeTeacher = 30;
        short SheetsPaper = 480;
        int SumStudent = OneTeacher + TwoTeacher + ThreeTeacher;
        int OneStudentSheetsPaper = SheetsPaper / SumStudent;
        System.out.println("\nЗадача № 3:\n\tУ Людмилы Павловны = " + OneTeacher + " ученика\n\tУ Анны Сергеевны = " +
                TwoTeacher + " учеников\n\tУ Екатерины Андреевны = " + ThreeTeacher +
                " учеников\n\tОбщее число листов бумаги = " + SheetsPaper + " штук\n\tОбщее число учеников = " +
                SumStudent + " человек\n\tКоличество листов на 1 ученика: " + OneStudentSheetsPaper + " штук");
        // Задача № 4:
        byte MachinePerformance = 16, OnePreparationTime = 2;
        short TwoPreparationTime = 20, ThreePreparationTime = 1440, FourPreparationTime = 4320;
        int FivePreparationTime = 43800;
        int MachinePerformanceOneMinutes = MachinePerformance / OnePreparationTime;
        int MachinePerformanceTwentyMinutes = MachinePerformanceOneMinutes * TwoPreparationTime;
        int MachinePerformanceDay = MachinePerformanceOneMinutes * ThreePreparationTime;
        int MachinePerformanceThreeDay = MachinePerformanceOneMinutes * FourPreparationTime;
        int MachinePerformanceMonth = MachinePerformanceOneMinutes * FivePreparationTime;
        System.out.println("\nЗадача № 4:\n\tПроизводительность машины = " + MachinePerformance
                + " бутылок за " + OnePreparationTime + " минуты\n\tПроизводительность машины = " +
                MachinePerformanceOneMinutes + " бутылок за 1 минуту\n\tПроизводительность машины = " +
                MachinePerformanceTwentyMinutes + " бутылок за " + TwoPreparationTime +
                " минут\n\tПроизводительность машины = " + MachinePerformanceDay +
                " бутылок за сутки\n\tПроизводительность машины = " + MachinePerformanceThreeDay +
                " бутылок за 3 дня\n\tПроизводительность машины = " + MachinePerformanceMonth + " бутылок за месяц");
        // Задача № 5:
        byte TotalCansPaint = 120, WhitePaintConsumption = 2, BrownPaintConsumption = 4;
        int TotalPaintConsumption, TotalNumberClasses, AmountWhitePaint, AmountBrownPaint;
        TotalPaintConsumption = WhitePaintConsumption + BrownPaintConsumption;
        TotalNumberClasses = TotalCansPaint / TotalPaintConsumption;
        AmountWhitePaint = TotalNumberClasses * WhitePaintConsumption;
        AmountBrownPaint = TotalNumberClasses * BrownPaintConsumption;
        System.out.println("\nЗадача № 5:\n\tОбщее количество банок краски = " + TotalCansPaint +
                " штук\n\tРасход банок белой краски на 1 класс = " + WhitePaintConsumption +
                " штуки\n\tРасход банок коричневой краски на 1 класс = " + BrownPaintConsumption +
                " штуки\n\tОбщий расход банок краски на 1 класс = " + TotalPaintConsumption +
                " штук\n\tКолличество классов = " + TotalNumberClasses +
                " классов\n\tКолличество купленной белой краски = " + AmountWhitePaint +
                " банок\n\tКолличество купленной коричневой краски = " + AmountBrownPaint +
                " банкок\n\tВ школе, где " + TotalNumberClasses + " классов, нужно " + AmountWhitePaint +
                " банок белой краски и " + AmountBrownPaint + " банок коричневой краски");
        // Задача № 6:
        short MilkQuantity = 200;
        byte QuantityBananas = 5, IceCreamQuantity = 2, NumberEggs = 4;
        byte BananaWeightOne = 80, MilkWeightOne = 105, IceCreamWeightOne = 100, EggWeightOne = 70;
        double TotalWeightGrams = (QuantityBananas * BananaWeightOne) + (MilkWeightOne * MilkQuantity) +
                (IceCreamQuantity * IceCreamWeightOne) + (NumberEggs * EggWeightOne);
        double TotalWeightKilograms = TotalWeightGrams / 1000;
        System.out.println("\nЗадача № 6\n\tКолличество бананов = " + QuantityBananas +
                " штук, где 1 банан по " + BananaWeightOne + " грамм\n\tКоичество молока = " + MilkQuantity +
                " мл, где 100 мл по " + MilkWeightOne + " грамм\n\tКоличество мороженного = " + IceCreamQuantity +
                " брикета по " + IceCreamWeightOne + " грамм\n\tКоличество яиц = " + NumberEggs +
                " яйца, где 1 яйцо по " + EggWeightOne + " грамм\n\tОбщий вес в граммах = " + TotalWeightGrams +
                " грамм\n\tОбший вес в килограммах = " + TotalWeightKilograms + " килограмм");
        // Задача № 7:
        int TargetWeightLossKilograms = 7;
        short OneWeightLossGrams = 250, TwoWeightLossGrams = 500;
        int ResultOneWeightLossGrams = (TargetWeightLossKilograms * 1000) / OneWeightLossGrams;
        int ResultTwoWeightLossGrams = (TargetWeightLossKilograms * 1000) / TwoWeightLossGrams;
        int AverageResult = (ResultOneWeightLossGrams + ResultTwoWeightLossGrams) / 2;
        System.out.println("\nЗадача № 7:\n\tНужно сбросить " + TargetWeightLossKilograms +
                " килограмм\n\tПри потере веса по " + OneWeightLossGrams + " грамм, понадобится " +
                ResultOneWeightLossGrams + " дней на похудение\n\tПри потере веса по " + TwoWeightLossGrams +
                " грамм, понадобится " + ResultTwoWeightLossGrams +
                " дней на похудение\n\tВ среднем темпе понадобится " + AverageResult + " день на похудение");
        // Задача № 8:
        int Masha = 67760, Denis = 83690, Kristina = 76230;
        int BeforeMashaYears = Masha * 12, BeforeDenisYears = Denis * 12,
                BeforeKristinaYears = Kristina * 12;
        System.out.println("\nЗадача № 8:\n\tЗапрлата Маши в месяц до повышения = " + Masha +
                " рублей, годовой доход до повышения = " + BeforeMashaYears +
                " рублей\n\tЗарплата Дениса в месяц до повышения = " + Denis +
                " рублей, годовой доход до повышения = " + BeforeDenisYears +
                " рублей\n\tЗарплата Кристины в месяц до повышения = " + Kristina +
                " рублей, годовой доход до повышения = " + BeforeKristinaYears + " рублей");
        int MashaNew = (Masha * 10) / 100, DenisNew = (Denis * 10)/100, KristinaNew = (Kristina * 10) / 100;
        int AfterMahaMonth = MashaNew + Masha, AfterDenisMonth = DenisNew + Denis, AfterKristinaMonth = KristinaNew +
                Kristina;
        int AfterMashaYears = AfterMahaMonth * 12, AfterDenisYears = AfterDenisMonth * 12,
                AfterKristinaYears = AfterKristinaMonth * 12;
        int DifferenceYearMasha = AfterMashaYears - BeforeMashaYears;
        int DifferenceYearDenis = AfterDenisYears - BeforeDenisYears;
        int DifferenceYearKristina = AfterKristinaYears - BeforeKristinaYears;
        System.out.println("\n\tМаша теперь получает " + AfterMahaMonth +
                " рублей. Годовой доход вырос на " + DifferenceYearMasha + " рублей и составляет теперь " +
                AfterMashaYears + " рублей.\n\tДенис теперь получает " + AfterDenisMonth +
                " рублей. Годовой доход вырос на " + DifferenceYearDenis + " и составляет теперь "
                + AfterDenisYears + " рублей\n\tКристина теперь получает " + AfterKristinaMonth +
                " рублей. Годовой доход вырос на " + DifferenceYearKristina +
                " рублей и составляет теперь " + AfterKristinaYears + " рублей.");}}
